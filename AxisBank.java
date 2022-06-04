package week3.day1.classroom;

public class AxisBank extends BankingInfo{
 
	public void Deposit()
	{
		System.out.println("Bank Current Deposit Amount is : RS 30,000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AxisBank ab=new AxisBank();
        ab.Deposit();
        ab.fixed();
        ab.saving();
	}

}
