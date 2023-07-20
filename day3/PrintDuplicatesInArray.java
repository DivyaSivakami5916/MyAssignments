package week1.day3;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<length;i++) {
		System.out.println("The numbers in the array list are:" +arr[i]);
		}
		for(int i=0;i<arr.length-1;i++)
		{
		int count=0;
		for(count=i+1;count<arr.length;count++)
		{
			if(arr[i]==arr[count])
			{
				
			System.out.println("The duplicate numbers in the array list are: " +arr[i] );
		}
		}

}

	}

}
