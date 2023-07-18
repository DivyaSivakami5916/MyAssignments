package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=-40;
		if(number<0)
		{
		int num=number*(-1);
			System.out.println("The entered negative number " +number+ " is a changed to the positive number " + num);
		}
		else 
			System.out.println("The entered number is a positive number: " + number);
		
		}
	}


