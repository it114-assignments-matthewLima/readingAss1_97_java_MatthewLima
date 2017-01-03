/**
 * 
 */
package readingAss1_97_MatthewLima;

/**
 * @author Matt
 *
 */
public class AccountRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		java.util.Date dateCreated = new java.util.Date();
		a1.setId(1122);
		System.out.println("ID is:  " + a1.getId());
		a1.setBalance(20000);
		System.out.println("Balance is:  " + a1.getBalance());
		a1.setAnnualInterestRate(4.5);
		System.out.println("Annual interest rate is:  " + a1.getAnnualInterestRate());
		a1.withdraw(2500);
		System.out.println("Your new Balance is:  "+ a1.getBalance());
		a1.deposit(3000);
		System.out.println("Your newest and Final balance is:  "+ a1.getBalance());
		System.out.println("Date of account creation:  " + dateCreated);
		
	}

}
