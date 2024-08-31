import java.util.Scanner;

public class Current extends Account{
	double overDraftLimit;
	double overDraftAmt;
	Scanner sc = new Scanner(System.in);
	
	public Current(int accNo, String hName, double balance) {
		super(accNo, hName, balance);
		overDraftAmt = 0;
		overDraftLimit = 50000;
		
		
		
		// TODO Auto-generated constructor stub
	}


	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}


	public double getOverDraftAmt() {
		return overDraftAmt;
	}


	public void setOverDraftAmt(double overDraftAmt) {
		this.overDraftAmt = overDraftAmt;
	}	
	
	public void Deposite() {
		System.out.println("How Many Amount Do you want to deposite: ");
		double amt = sc.nextDouble();
		if(overDraftAmt ==  0) {
			this.setBalance(this.getBalance() + amt);
			System.out.println("balance = " + this.getBalance() + "OverDraftAmt = " +  this.getOverDraftAmt() + "limit = " + this.getOverDraftLimit());
			System.out.println("Deposite Succefully");
		}
		else {
			if(amt > overDraftAmt) {
				this.setBalance(amt - overDraftAmt);
				setOverDraftAmt(0);	
				System.out.println("balance = " + this.getBalance() + "OverDraftAmt = " + this.getOverDraftAmt() + "limit = " + this.getOverDraftLimit());
				System.out.println("Deposite Succefully\n");
			}
			else {
				setOverDraftAmt(overDraftAmt - amt);
				System.out.println("balance = " + this.getBalance() + "OverDraftAmt = " + this.getOverDraftAmt() + "limit = " + this.getOverDraftLimit());
				System.out.println("Deposite Succefully\n");
			}
		}
		
	}
	public void Withdraw() {
		System.out.println("Enter the Amount to Withdraw: ");
		double amt = sc.nextDouble();
		if(this.getBalance()>=amt) {
			this.setBalance(this.getBalance() - amt);
			System.out.println("1.Withdraw Succesfully!");
			System.out.println("balance = " + this.getBalance() + "OverDraftAmt = " +  this.getOverDraftAmt() + "limit = " + this.getOverDraftLimit());
		}
		else if(this.getBalance() + this.getOverDraftLimit() - this.getOverDraftAmt() >= amt){
			this.setOverDraftAmt(this.getOverDraftAmt() + amt - this.getBalance());
			this.setBalance(0);
			System.out.println("2.Withdraw Succesfully!");
			System.out.println("balance = " + this.getBalance() + "OverDraftAmt = " +  this.getOverDraftAmt() + "limit = " + this.getOverDraftLimit());
		}
		else {
			System.out.println("balance = " + this.getBalance() + "OverDraftAmt = " +  this.getOverDraftAmt() + "limit = " + this.getOverDraftLimit());
			System.out.println("3.You Only Withdraw ₹ " + (this.getOverDraftLimit() - this.getOverDraftAmt()));
		}
	}
	
	
	public void CalInterest() {
		System.out.println("Your Account is Current Account Interest rate not For You!\n");
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
