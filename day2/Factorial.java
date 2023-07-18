package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=num*i;
		}
		System.out.println("The factorial of the given number " +num+ " is " +fact);
	}

}
