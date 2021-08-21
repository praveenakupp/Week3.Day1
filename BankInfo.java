
public class BankInfo extends AxisBank {

	public void saving()
	{
		System.out.println("Savings Account");
		
	}
	public void fixed()
	{
		System.out.println("Fixed Account");
		
	}
	public void deposit()
	{
		System.out.println("Deposits");
	}
	public static void main(String[] args)
	{
		BankInfo ab=new BankInfo();
		ab.deposit();
		ab.saving();
		ab.fixed();
		ab.deposit();
	}
}
