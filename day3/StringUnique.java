package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="google";
		//String str2 ="";
		
		char[] arr = str1.toCharArray();
		Set<Character> num = new LinkedHashSet<Character>();
		
		for (Character c : arr) {
		
			num.add(c);
		}
		
		System.out.println("Unique Character is: "+num);
	}

}
