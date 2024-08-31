import java.util.Scanner;

public class SavingAcc extends Account{
	double minBalance=10000;
	double rateOfInterest = 2.5;
	Scanner sc = new Scanner(System.in);
	
	public SavingAcc(int accNo, String hName, double Balance) {
		super(accNo, hName, Balance);
	}
	
	

	public  double getRateOfInterest() {
		return rateOfInterest;
	}

	public  void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}



	public double getMinbalance() {
		return minBalance;
	}

	public void setMinbalance(double minBalance) {
		this.minBalance = minBalance;
	}


	
	public void Deposite() {
		System.out.println("How Many Amount Do you want to deposite: ");
		double amt = sc.nextDouble();
		this.setBalance(amt + this.getBalance());
		System.out.println("Your Amount Deposite\n");
		return;
	}
	
	
	public void Withdraw() {
		System.out.println("How Many Amount Do you want to deposite: ");
		double amt = sc.nextDouble();
		if(this.getBalance() - amt >= minBalance) {
			this.setBalance(this.getBalance() - amt); 
		}
		else {
			System.out.println("Insufficient Balance!");
			System.out.println("You can Withdraw only ₹ " + (this.getBalance() - minBalance ) + "\n");
		}
	}
	
	
	public void CalInterest() {
			System.out.println("Interest on Saving Account is " + rateOfInterest);
			System.out.println("If You have placed balance");
			double interest = (this.getBalance() + (this.getBalance()*(this.getRateOfInterest()/100)));
			System.out.println("for 3 Month your balance will be ₹ " + interest);
			System.out.println("for 6 Month your balance will be ₹ " + interest*2);
			System.out.println("for 9 Month your balance will be ₹ " + interest*3);
	}
	public void CheckBalance() {
		System.out.println("Your Balance is ₹ " + this.getBalance());
	}

	public String toString() {
		String ps = super.toString();
		return ps;
		//return "accNo=" + accNo + ",\nhName=" + hName + ",\nopDate=" + opDate + ",\naccType=" + accType + ",\nbalance=" + balance ;
			
	}
	
	
	
}
