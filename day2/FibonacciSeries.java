package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0,secNum=1,sum,range=8;
		System.out.println("The range of Fibonacci Series is: ");
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1;i<=range;i++)
		{
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
		
}
}
