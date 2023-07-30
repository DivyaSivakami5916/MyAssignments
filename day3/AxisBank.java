package week2.day3;
//Method Overriding

public class AxisBank extends BankInfo {

	public void Deposit()
	{
		System.out.println("The new Deposited amount is 4 lakhs");
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.Savings();
		ab.Fixed();
		ab.Deposit();

	}

}
