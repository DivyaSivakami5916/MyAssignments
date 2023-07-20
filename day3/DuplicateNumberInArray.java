package week1.day3;

import java.util.Arrays;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
	int[] nums= {2,5,7,7,5,2,3};
	int length=nums.length;
	Arrays.sort(nums);
	for(int i=0;i<length;i++) {
	System.out.println("The numbers in the array are:" +nums[i]);
	}
	for(int i=0;i<nums.length;i++)
	{
		for(int j=i+1;j<nums.length;j++)
			if(nums[i]==nums[j]) 
			{
				System.out.println(nums[i]);
			}
	}
	}

}
