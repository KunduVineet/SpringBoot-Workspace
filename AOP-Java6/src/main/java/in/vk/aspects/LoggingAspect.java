package in.vk.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* in.vk.services.BankTransaction.transactionUsingInternetBanking(..)) || "
			+ "execution(* in.vk.services.BankTransaction.transactionUsingUPI(..)) ||"
			+ "execution(* in.vk.services.PaytmTransaction.transactionUsingUPI(..)) ||")
	public void myLoggingBefore() {
		System.out.println("----------Before Logging-----------");
	}

}
