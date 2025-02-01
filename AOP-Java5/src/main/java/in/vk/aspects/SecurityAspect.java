package in.vk.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspect {
	
	@Before("execution(* in.vk.services.BankTransaction.*(..))")
	public void mySecurity() {
		
		System.out.println("-----------Security Service--------------");
		
	}

}
