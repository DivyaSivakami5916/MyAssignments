package week2.day3;

public class Calculator {
	
	public int add(int x, int y)
	{
		int sum;
        sum = x + y;
        System.out.println("The addition of two integers are: " +sum);
		return sum;
	}
	public int add(int a, int b,int c)
	{
		int sum;
        sum = a + b + c;
        System.out.println("The addition of three integers are: "+sum);
        return sum;
	}
	public double multiply(double d, double e)
	{
		double mul;
        mul = d*e;
        System.out.println("The multiplication of two double values are: "+mul );
		return mul;
	}
	public float multiply(float f, float g)
	{
	float fl;
	fl = f*g;
	System.out.println("The multiplication of two float values are: "+fl);
	return fl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(5,9);
		cal.add(5,9,6);
		cal.multiply(20.565, 15.878);
		cal.multiply(12.45f,55.57f);
	}

}
