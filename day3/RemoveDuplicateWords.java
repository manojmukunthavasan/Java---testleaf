package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";	
		String gap ="";
		   String[] split = text.split(" ");
		   Set <String> str = new LinkedHashSet <String>(); 
		   for (String i : split) {
			   str.add(i);
			}
		List<String> list = new ArrayList<String>(str);
		for (String ch : list) {
			gap = gap+" "+ch; 
			
			}
		System.out.println(gap);
	}

}
