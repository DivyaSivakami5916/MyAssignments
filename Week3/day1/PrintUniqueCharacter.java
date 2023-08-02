package Week3.day1;

import java.util.HashSet;

import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="DivyaSivakami";
		char[] chararray=name.toCharArray();
		Set <Character> uni=new HashSet <Character>();
		Set <Character> dup=new HashSet <Character>();
	
		for(int i=0;i<chararray.length;i++)
		{
			if(!uni.add(chararray[i]))
			{
				dup.add(chararray[i]);
				
			}
		}
			
		System.out.println(uni);
		
		
	}

}
