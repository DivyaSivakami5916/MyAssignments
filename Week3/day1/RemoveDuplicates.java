package Week3.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String compName="google";
		char[] chararray=compName.toCharArray();
		Set <Character> uni=new LinkedHashSet <Character>();
		Set <Character> dup=new LinkedHashSet <Character>();
	
		for(int i=0;i<chararray.length;i++)
		{
			if(!uni.add(chararray[i]))
			{
				dup.add(chararray[i]);
				
			}
		}
			
		System.out.println(uni);
		
		System.out.println(dup);
		
	}

}
