/**
 * 
 */
package readingAss1_97_MatthewLima;

import java.util.Date;

/**
 * @author Matt
 *
 */
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	public Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	public void setId(int i){
		id = i;
	}
	public void setBalance(double b){
		balance = b;
	}
	public void setAnnualInterestRate(double a){
		annualInterestRate = a;
	}
	public void dateCreated(Date d){
		dateCreated = d;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate /12;
	}
	public double getMonthlyInterest(){
		return annualInterestRate / 12 * balance;
	}
	public double withdraw(double amount){
		return balance -= amount;
	}
	public double deposit(double amount){
		return balance += amount;
	}
}
