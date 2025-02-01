package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vk.services.BankTransaction;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("/in/vk/resources/applicationContext.xml");
    	
    	BankTransaction bt = (BankTransaction) context.getBean("banktransId");
    	
    	bt.transactionUsingCreditCard();
    	System.out.println();
    	
    	bt.transactionUsingInternetBanking();
    	System.out.println();
    	
    	bt.transactionUsingUPI();
    	System.out.println();
    	
    	bt.transactionUsingWallet();
    }
}
