package Week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] data= {1,4,6,7,2,3,8,9,4,6,4,2,7,8,3};
		Set <Integer> uni=new TreeSet <Integer>();
		Set <Integer> dup=new TreeSet <Integer>();
	
		for(int i=0;i<data.length;i++)
		{
			if(!uni.add(data[i]))
			{
				dup.add(data[i]);
				
			}
		}
			
		System.out.println(uni);
		
		int n=data.length+1;
		int sum=(n*(n+1))/2;
		
		for(int i=0;i< data.length;i++)
		{
			sum=sum-data[i];
		}
		System.out.println("Missing number is " +sum);
		
		
	}

	}
