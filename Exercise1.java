package Exercise1;
import java.util.Date; 
import java.text.SimpleDateFormat;
import java.util.Calendar ; 
import java.text.DateFormat ; 
class Account {
	private int id = 0 ; 
	private double balance = 0.0 ; 
	private double annualInterestRate = 0.0 ; 
	private String dateCreated = "" ; 

	public Account(){

	}
	public Account(int newID, double newBalance)
	{
		id = newID ; 
		balance = newBalance ;
	}
	public void setAccountID(int actID)
	{
		id = actID ; 
	}
	public int getID()
	{
		return id ; 
	}
	public double getBalance()
	{
		return balance ; 
	}
	public void withdraw(double withdrawal)
	{
		balance -= withdrawal ; 
	}
	public void deposit(double deposit)
	{
		balance+=deposit ; 
	}
	public void setInterestRate(double newInterest)
	{
		annualInterestRate = newInterest ; 
	}
	public double getMonthlyInterest() {
		return annualInterestRate ; 
	}
	public String setDate()
	{
		DateFormat df = new SimpleDateFormat("MM/dd/yy") ; 
		Date date = new Date() ; 
		dateCreated = df.format(date) ; 
		return dateCreated ; 
	}



public static void main(String [] args)
{
	Account act1 = new Account(1122,20000) ; 
	act1.setInterestRate(4.5) ; 
	act1.withdraw(2500) ; 
	act1.deposit(3000) ; 
	System.out.println("For account number: " + act1.getID()) ; 
	System.out.println("Date Created: " + act1.setDate()) ; 
	System.out.println("Balance: " + act1.getBalance()) ; 
	System.out.println("Interest Rate: " + act1.getMonthlyInterest()) ; 



}
}