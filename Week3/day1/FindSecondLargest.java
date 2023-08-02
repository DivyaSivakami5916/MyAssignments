package Week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
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
		List<Integer> list=new ArrayList<Integer>(uni);
		System.out.println("The second largest number is : "+ list.get(4));
	}
}
	
