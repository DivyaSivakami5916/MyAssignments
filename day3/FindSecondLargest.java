package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int length=data.length;
		Arrays.sort(data);
		System.out.println("The sorted array list is: ");
		for (int i = 0; i < length; i++)   
		{       
		System.out.println(data[i]);   
		}   	
		System.out.println("The Second largest value in the array is: " + data[4]);
	}

}
