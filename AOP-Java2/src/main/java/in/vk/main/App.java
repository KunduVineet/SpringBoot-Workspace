package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vk.resources.SpringConfig;
import in.vk.services.BankTransaction;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	BankTransaction bt = context.getBean(BankTransaction.class);
    	
    	bt.transactionUsingCreditCard();
    	System.out.println();
    	
    	bt.transactionUsingInternetBanking();
    	System.out.println();
    	
    	bt.transactionUsingWallet();
    	System.out.println();
    	
    	bt.transactionUsingUPI();
    }
}
