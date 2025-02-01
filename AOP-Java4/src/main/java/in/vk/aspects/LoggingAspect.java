package in.vk.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
	
	@Around("execution(* in.vk.services.BankTransaction.transactionUsingInternetBanking(..)) || "
			+ "execution(* in.vk.services.BankTransaction.transactionUsingUPI(..)) ")
	public void myLoggingAfter(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("----------Before Logging-----------");
		
		proceedingJoinPoint.proceed();
		
		System.out.println("----------After Logging-----------");

	}

}
