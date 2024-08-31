import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Salary extends Account {
	LocalDate lastTransDate;
	static int timeLimit = 2;
	static double rateOfInterest = 4.5;
	
	Scanner sc=new Scanner(System.in);
	
	public Salary(int accNo, String hName, double balance,String lastTransDate) {
		super(accNo, hName, balance);
		this.lastTransDate=LocalDate.parse(lastTransDate);
		// TODO Auto-generated constructor stub
	}


	public LocalDate getLastTransDate() {
		return lastTransDate;
	}


	public void setLastTransDate(LocalDate lastTransDate) {
		this.lastTransDate = lastTransDate;
	}


	public static int getTimeLimit() {
		return timeLimit;
	}


	public static void setTimeLimit(int timeLimit) {
		Salary.timeLimit = timeLimit;
	}


	public static double getRateOfInterest() {
		return rateOfInterest;
	}


	public static void setRateOfInterest(double rateOfInterest) {
		Salary.rateOfInterest = rateOfInterest;
	}
	
	public void Deposite() {
		System.out.println("How Many Amount Do you want to deposite: ");
		double amt = sc.nextDouble();
		this.setBalance(amt + this.getBalance());
		System.out.println("\nYour Amount Deposite"+"\n Availible total balance is: "+this.getBalance()+"\n");
		return;	
	}
	
	
	public void Withdraw() {
		if(!IsFreeze()) {
			System.out.println("How Many Amount Do you want to Withdrawl: ");
			double amt = sc.nextDouble();
			if(this.getBalance()>=amt) {
				
				this.setBalance(this.getBalance() - amt);
				LocalDate nowDate = LocalDate.now();
				this.setLastTransDate(nowDate);
				System.out.println("Withdraw SuccesFully!"+"\nAvailible balance is: "+this.getBalance());
				
			}
			else {
				System.out.println("Insufficient Balance\n You can only withdraw ₹ " + this.getBalance());
			}
		}
		else {
			System.out.println("Your Account is Freeze!");
		}
	}
	
	public boolean IsFreeze() {
		LocalDate nowDate = LocalDate.now();
		//long diff = ChronoUnit.MONTHS.between(this.getLastTransDate(),nowDate);
		if(ChronoUnit.MONTHS.between(this.getLastTransDate(),nowDate)>timeLimit) {
			return true;	
		}
		else {
			return false;
		}	
	}
	
	public void CheckBalance() {
		System.out.println("Your Balance is ₹ " + this.getBalance());
	}
	
	public void CalInterest() {
		System.out.println("\nInterest on Salary Account is " + rateOfInterest);
		System.out.println("\nIf You have placed balance");
		double interest = (this.getBalance() + (this.getBalance()*(this.getRateOfInterest()/100)));
		System.out.println("for 3 Month your balance will be ₹ " + interest);
		System.out.println("for 6 Month your balance will be ₹ " + interest*2);
		System.out.println("for 9 Month your balance will be ₹ " + interest*3);
	}
	
	
	
	public String toString() {
		String ps = super.toString();
		return ps;
		//return "accNo=" + accNo + ",\nhName=" + hName + ",\nopDate=" + opDate + ",\naccType=" + accType + ",\nbalance=" + balance ;
			
	}
	
	
	
	
	
}
