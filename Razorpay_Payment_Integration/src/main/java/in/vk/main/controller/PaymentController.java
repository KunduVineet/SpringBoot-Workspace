package in.vk.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.RazorpayException;

import in.vk.main.service.PayService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	@Autowired
	PayService payService;
	
	@PostMapping("/create/order")
	public String createOrder(@RequestParam int amount, @RequestParam String currency, String recept_id) throws RazorpayException {

		return payService.createOrder(amount, currency, "recept-id");
	}
	
}
