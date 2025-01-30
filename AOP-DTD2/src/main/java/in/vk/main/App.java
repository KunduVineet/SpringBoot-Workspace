package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vk.services.BankTransactions;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("/in/vk/resources/applicationContext.xml");
    	
    	BankTransactions bt =  (BankTransactions) context.getBean("proxyId");
    	bt.transactionUsingUPI();
    	System.out.println();
    	bt.transactionUsingWallet();
    	System.out.println();
    	bt.transactionUsingCreditCard();
    	System.out.println();
    	bt.transactionUsingInternetBanking();
    }
}
