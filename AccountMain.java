import java.util.Scanner;

class InSufficientBalancedException extends Exception		//making a userdefined exception
{

	public InSufficientBalancedException(String string)
	
	{
		//creating a constructor
	}	
}
public class Account {
	float balance=0;
	float totalbalance=0;
	float amount;
	
	Scanner sc=new Scanner(System.in);
	
	public void deposite()
	{
		System.out.println("enter the available balace :");	//checking available balance in account 	
		balance=sc.nextFloat();
		System.out.println("deposite money");
		amount=sc.nextFloat();				//depositing money through user
		totalbalance=balance+amount;
		System.out.println("Total balance is"+totalbalance);		//printing the total balance 
	}
	
	public void withdraw() throws InSufficientBalancedException 
	{
		float withdraw;
		System.out.println("enter the amount to be withdraw");
		withdraw=sc.nextFloat();			//to withdraw amount
		if(totalbalance<withdraw)			//checking that total balance is less than withdraw amount or not
		{
			//if the total balance is less then withdraw balance it will throw the exception
			throw new InSufficientBalancedException("NO sufficient fund to withdraw");
		}
		else {
			//if the total balance is greater then withdraw balance then print it 
			System.out.println("please take money");
		}
			
	}
}



public class AccountMain {
	
	public static void main(String[] args) {
		Account a=new Account();		//creating a object
		a.deposite();			//calling a method
		try
		{
			//if condition becomes the false throws the exception
			a.withdraw();		//calling a method
			
		}
		catch(Exception e)		//the exception throws by the try block catch block catch that exception
		{
			System.out.println(e);
		}
		 
	}

}