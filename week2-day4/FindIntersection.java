package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1= {3,2,11,4,6,7};
		int [] n2= {1,2,8,4,9,7};
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		for(int i=0;i<n1.length;i++)
		{
			l1.add(n1[i]);
			
		}
		for (int j=0;j<n2.length;j++)
		{
			l2.add(n2[j]);
			
		}
		System.out.println("The elements in list is: "+ l1);
		System.out.println("The elements in list is: "+ l2);
		for(int i=0;i<l1.size();i++)
		{
			for(int j=0;j<l2.size();j++)
			{
				if(l1.get(i)==l2.get(j))
				{
					System.out.println(l2.get(i));
				}
			}
		}
	}

}
