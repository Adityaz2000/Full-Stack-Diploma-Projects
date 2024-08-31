import java.util.Scanner;
public class Loan extends Account{
	double loanGiven;
	double loanpaid;
	double rateOfInterest = 9.5;
	Scanner sc = new Scanner(System.in);
	
	
	public Loan(int accNo, String hName) {
		super(accNo, hName, 0 );
		// TODO Auto-generated constructor stub
	}
	
	public double getLoanGiven() {
		return loanGiven;
	}

	public void setLoanGiven(double loanGiven) {
		this.loanGiven = loanGiven;
	}

	public double getLoanpaid() {
		return loanpaid;
	}


	public void setLoanpaid(double loanpaid) {
		this.loanpaid = loanpaid;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}


	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}




	public void Deposite() {
		System.out.println("How Many Amount Do you want to deposite: ");
		double amt = sc.nextDouble();
		if(this.getBalance() < 0) {
			if(0-this.getBalance() < amt) {
				this.setBalance(0);
				System.out.println("Loan Full Paid");
			}
			this.setBalance(this.getBalance() + amt);
			System.out.println("Deposite Succesfully");
			System.out.println("Remaining Loan Amount ₹ : " + (0-this.getBalance()));
		}
		else {
			System.out.println("No Dues on your Account");
		}
	}
	
	
	public void Withdraw() {
		if(this.getBalance() == 0) {
			System.out.println("How Many Amount do you want to Loan : ");
			double amt = sc.nextDouble();
			this.setLoanGiven(amt);
			System.out.println("Your loan is Pass of Amount ₹ : " + this.getLoanGiven() + " on Interest rate of " + this.getRateOfInterest() + "\nYou Need to paid ₹ : " + (amt + amt*this.getRateOfInterest()/100));
			this.setBalance(0-((amt*this.getRateOfInterest())/100));
		}
		else {
			System.out.println("Your previous Loan is Pending ₹ : " + (0-this.getBalance()));
		}
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
