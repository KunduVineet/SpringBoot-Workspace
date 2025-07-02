package in.vk.main.service;
import in.vk.main.RazorpayPaymentIntegrationApplication;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class PayService {

    private final RazorpayPaymentIntegrationApplication razorpayPaymentIntegrationApplication;

	@Value("${razorpay.api.key}")
	private String apiKey;
	
	@Value("${razorpay.api.secret}")
	private String apiSecret;

    PayService(RazorpayPaymentIntegrationApplication razorpayPaymentIntegrationApplication) {
        this.razorpayPaymentIntegrationApplication = razorpayPaymentIntegrationApplication;
    }
	
	public String createOrder(int amount, String currency, String receiptId) throws RazorpayException {
		RazorpayClient client = new RazorpayClient(apiKey, apiSecret);
		JSONObject orderRequest = new JSONObject();
		orderRequest.put("amount", amount * 100);
		orderRequest.put("currency", currency);
		orderRequest.put("receiptId", receiptId);
		
		Order order = client.orders.create(orderRequest);
		return order.toString();
	}

	
	
}
