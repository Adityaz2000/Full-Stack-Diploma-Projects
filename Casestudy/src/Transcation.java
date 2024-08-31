
public class Transcation {
	
	int transactionNo;
	int accountNum;
	String trnsactionType;
	double amount;
	static int num=1;
	public static Transcation[] trr = new Transcation[50];
	
	
	
	public Transcation() {
		// TODO Auto-generated constructor stub
	}



	public Transcation(int transactionNo, int accountNum, String trnsactionType, double amount) {
		super();
		this.transactionNo = transactionNo;
		this.accountNum = accountNum;
		this.trnsactionType = trnsactionType;
		this.amount = amount;
	}



	public int getTransactionNo() {
		return transactionNo;
	}



	public void setTransactionNo(int transactionNo) {
		this.transactionNo = transactionNo;
	}



	public int getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}



	public String getTrnsactionType() {
		return trnsactionType;
	}



	public void setTrnsactionType(String trnsactionType) {
		this.trnsactionType = trnsactionType;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public static int getNum() {
		return num;
	}



	public static void setNum(int num) {
		Transcation.num = num;
	}



	public void transactionDisplay()
	{
		
		System.out.println("\t "+this.getTransactionNo()+"\t|\t  "+this.getAccountNum()+"\t   |\t"+this.getTrnsactionType()+"\t|\t\t"+this.getAmount()+"\t");
		
	}
	
	
	
}
