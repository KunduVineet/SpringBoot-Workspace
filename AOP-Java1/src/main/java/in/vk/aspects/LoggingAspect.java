package in.vk.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* in.vk.services.BankTransaction.*(..))")
	public void myLoggingBefore() {
		System.out.println("----------Before Logging-----------");
	}

}
