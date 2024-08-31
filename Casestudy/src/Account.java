import java.time.LocalDate;
import java.util.Date;
public class Account {
	
	int accNO;
	String hName;
	double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNO, String hName, double balance) {
		super();
		this.accNO = accNO;
		this.hName = hName;
		this.balance = balance;
	}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void Deposite()
	{
	}
	
	public void Withdraw()
	{
	}
	
	public void CalInterest()
	{
	}
	
	public void CheackBalance()
	{
	}
	
	public String toString()
	{
		return "accno="+this.accNO+"\nhName="+this.hName+"\nbalance="+this.balance;
	}
}
