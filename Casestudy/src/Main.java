import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static Random ran=new Random();
	public static int count=0;
	static Scanner sc = new Scanner(System.in);
	static Account[] arr=new Account[50];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		do {
			System.out.println("\n1.Login as Admin\n2.login as User\n3.Open Account\n0.Exit");
			System.out.println("\nenter your choice: ");
			choice=sc.nextInt();
			if(choice==1) {
				Admin();
			}
			else if(choice==2) {
				User();
				
			}else if(choice==3) {
				
				int accNo;
				double amt;
				System.out.println("\n1.Saving Account\n2.Salary Account\n3.Current Account\n4.Loan Account");
				System.out.println("\nenter your choice: ");
				int choice1=sc.nextInt();
				
				System.out.println("Enter Name: ");
				sc.nextLine();
				String hName=sc.nextLine();
				
				System.out.println("Enter Amount to Deposite: ");
				amt=sc.nextDouble();
				
				if(choice1==1)
				{	
					System.out.println("Note:- \nIf you Want to Create Saving Account,then you Want to deposite Amount More than 100000Rs");
					
					if(amt>10000)//account type Saving
					{
						accNo=AccountNoGenerate();
						arr[count++]=new SavingAcc(accNo,hName,amt);
						System.out.println("\nSaving Account Created \nyour Account Information\n");
						System.out.println(arr[count-1]);
						System.out.println("\n");
						
					}
					else {
						
						System.out.println("Note:- \nIf you Want to Create Saving Account,then you Want to deposite Amount More than 10000Rs");
						System.out.println("\nyour Account Not Created \n due to you Deposite Amount less then 10k!\n");
						
					}
					//Account.setAcctype("saving");
				}
				else if(choice1==2){
					
					System.out.println("Enter Amount to deposite: ");
					amt=sc.nextDouble();
					
					System.out.println("Enter Transaction date in format yyyy-mm-dd: ");
					sc.nextLine();
					
					String date = sc.nextLine();
					
					accNo = AccountNoGenerate();
					
					arr[count++] = new Salary(accNo,hName,amt,date);
					
					System.out.println("Salary Account Created\nYour Account Information");
					System.out.println(arr[count-1]);	
					System.out.println("\n");
				}
				else if(choice1==3) {
					System.out.println("Enter Amount to deposite: ");
					amt=sc.nextDouble();
					
					accNo=AccountNoGenerate();
					
					arr[count++]=new Current(accNo,hName,amt);
					
					System.out.println("Current Account Created \nYour Account Information\n");
					System.out.println(arr[count-1]);
					System.out.println("\n");
				}
				else if(choice1==4)
				{
					accNo = AccountNoGenerate();
					
					arr[count++] = new Loan(accNo,hName);
					System.out.println("Loan Account Created\nYour Account Information");
					System.out.println(arr[count-1]);	
					System.out.println("\n");
				}
				else {
					System.out.println("You Enter Wrong Choice");
				}
			}
			else if(choice==0)
			{
				System.out.println("----------thankyou---------");
				break;
			}
			else
			{
				System.out.println("you enter wrong choice..!\n");
			}
		}while(choice!=0);

	}
	
	
	public static int AccountNoGenerate() {
		int max=1000000;
		int min=100000;
		return ran.nextInt(max-min+1)+min;
	}
	
	public static  int otpGenerate()
	{
		int max=10000;
		int min=1000;
		return ran.nextInt(max-min+1)+min;
	}
	
	public static void AccountDetails()
	{	
		if(count>0)
		{
			System.out.println("***Information Of All Accounts***");
			for(int i=0;i<count;i++)
			{
				System.out.println("Account Number: "+ arr[i].getAccNO()+"\n Account Holder Name: "+arr[i].gethName()+"\n");
			}
		}
		else
		{
			System.out.println("No Account is Open");
		}
		
	}
	
	
	
	public static void Admin()
	{
		String id,pass;
		System.out.println("Enter your Admin Id: ");
		sc.nextLine();
		id= sc.nextLine();
		if(id.equals("Admin07"))
		{
			System.out.println("Enter your Password: ");
			pass = sc.nextLine();
			if(pass.equals("Admin@154"))
			{
				int choice2;
				do
				{
					System.out.println("\nEnter Your choice: \n1.Display All Account Details\n2.daily Report\n0.logout ");
					choice2=sc.nextInt();
					if(choice2==0) {
						break;
					}
					else if(choice2==1)
					{
						AccountDetails();
					}
					else if(choice2==2)
					{
						for (int i = 0; i < Transcation.trr.length; i++) {
						    if (Transcation.trr[i] != null) {
						        Transcation.trr[i].transactionDisplay();
						    } 
						    
						}//daily report
						
					}
					else
					{
						System.out.println("You Enter Wrong choice..!\n");
					}
				}while(choice2!=0);
			}
			else
			{
				System.out.println("you Enter wrong PassWord..!\n");
				
			}
		}
		else
		{
			System.out.println("you Enter Wrong Id...!\n");
			
		}
	}
	
	public static void User()
	{
		System.out.println("Enter User Id(Account No): ");
		int acc=sc.nextInt();
		int flag=0;
		for(int i=0;i<count;i++)
		{
			if(arr[i].getAccNO()==acc)
			{
				flag=1;
				int otp=otpGenerate();
				
				System.out.println("captcha: "+ otp);
				System.out.println("Enter the Passward: ");
				int pass=sc.nextInt();
				if(pass==otp)
				{
					int ch;
					do {
						System.out.println("Enter your choice: \n1.Deposite\n2.withdraw\n3.Calculate Interest\n4.Check Balance\n5.Logout");
						ch=sc.nextInt();
						if(ch==1)
						{
							arr[i].Deposite();
						}
						else if(ch==2)
						{
							arr[i].Withdraw();
						}
						else if(ch==3)
						{
							arr[i].CalInterest();
						}
						else if(ch==4)
						{
							arr[i].CheackBalance();
						}
						
						else if(ch==5) {
							System.out.println("log out Successfully..!");
						}
					}while(ch!=0);
				}else
				{
					System.out.println("you Entered Wrong Otp\n");
				}
			}
		}
		if(flag==0)
		{
			System.out.println("you ENtered Wrong User Id! or You Cannot Open Account\n");
			
		}
		
	}
	
}
