package in.vk.main.jwt;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class jwtUtils {
private static final Logger logger = LoggerFactory.getLogger(jwtUtils.class);

@Value("${spring.app.jwtSecret}")
private String jwtSecret;

@Value("${spring.app.jwtExpirationMs}")
private int jwtExpirationMs;

public String getJwtFromHeader(HttpServletRequest request) {
	String bearerToken = request.getHeader("Authorization");
	logger.debug("Authorization Header :{}",bearerToken);
	if(bearerToken != null && bearerToken.startsWith("Bearer ")) {
		return bearerToken.substring(7);
	}
	return null;
}

public String generateTokenFromUsername(UserDetails userDetails) {
	String username = userDetails.getUsername();
	return Jwts.builder()
			.subject(username)
			.issuedAt(new Date())
			.expiration(new Date((new Date)).getTime()+ jwtExpirationMs)
			.signWithKey(key())
			.compact();
}

}
