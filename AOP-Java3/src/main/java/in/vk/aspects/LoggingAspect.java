package in.vk.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* in.vk.services.BankTransaction.transactionUsingInternetBanking(..)) || "
			+ "execution(* in.vk.services.BankTransaction.transactionUsingUPI(..)) ")
	public void myLoggingBefore() {
		System.out.println("----------Before Logging-----------");
	}
	
	@After("execution(* in.vk.services.BankTransaction.transactionUsingInternetBanking(..)) || "
			+ "execution(* in.vk.services.BankTransaction.transactionUsingUPI(..)) ")
	public void myLoggingAfter() {
		System.out.println("----------After Logging-----------");
	}

}
