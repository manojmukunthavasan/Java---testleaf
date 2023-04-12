package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniquesCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String str = "babu";
			String space = "";
			char[] ch1 = str.toCharArray();
			Set <Character> set1 = new HashSet <Character>();
			for (Character i : ch1) {
				boolean add = set1.add(i);
				if(!add) {
					set1.remove(i);
					}
				}
			List <Character> list = new ArrayList<Character>(set1);
			
			for (Character ch2 : list) {
				space = space+" "+ch2;
			}
			System.out.println(space);
			}
	}


