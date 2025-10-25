package in.vk.service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import in.vk.dto.OtpStatus;
import in.vk.dto.PasswordResetRequestDto;
import in.vk.dto.PasswordResetResponseDto;
import in.vk.main.config.TwilioConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

@Service
public class TwilioOTPService {
    
    @Autowired
    private TwilioConfig twilioConfig;

    private final Map<String, OTPData> otpMap = new ConcurrentHashMap<>();

    private static class OTPData {
        String otp;
        LocalDateTime expiryTime;
        
        OTPData(String otp, LocalDateTime expiryTime) {
            this.otp = otp;
            this.expiryTime = expiryTime;
        }
    }

    public Mono<PasswordResetResponseDto> sendOTPForPasswordReset(PasswordResetRequestDto passwordResetRequestDto) {
        PasswordResetResponseDto passwordResetResponseDto;
        try {
            PhoneNumber to = new PhoneNumber(passwordResetRequestDto.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());
            String otp = generateOTP();
            String otpMessage = "Dear Customer, Your OTP is ##" + otp + "##. Use this Passcode to complete your transaction. Thank You.";
            
            Message message = Message
                    .creator(to, from, otpMessage)
                    .create();
            
            // Store OTP with 5 minutes expiry
            otpMap.put(passwordResetRequestDto.getUserName(), 
                      new OTPData(otp, LocalDateTime.now().plusMinutes(5)));
            
            passwordResetResponseDto = new PasswordResetResponseDto(OtpStatus.DELIVERED, otpMessage);
        } catch (Exception ex) {
            passwordResetResponseDto = new PasswordResetResponseDto(OtpStatus.FAILED, ex.getMessage());
        }
        return Mono.just(passwordResetResponseDto);
    }

    public Mono<String> validateOTP(String userInputOtp, String userName) {
        OTPData otpData = otpMap.get(userName);
        
        if (otpData == null) {
            return Mono.error(new IllegalArgumentException("OTP not found or already used!"));
        }
        
        if (LocalDateTime.now().isAfter(otpData.expiryTime)) {
            otpMap.remove(userName);
            return Mono.error(new IllegalArgumentException("OTP expired! Please request a new one."));
        }
        
        if (userInputOtp.equals(otpData.otp)) {
            otpMap.remove(userName);
            return Mono.just("Valid OTP, please proceed with your transaction!");
        } else {
            return Mono.error(new IllegalArgumentException("Invalid OTP, please retry!"));
        }
    }

    // 6 digit OTP
    private String generateOTP() {
        return new DecimalFormat("000000")
                .format(new Random().nextInt(999999));
    }
}