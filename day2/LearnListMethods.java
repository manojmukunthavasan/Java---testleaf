package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// list in create
		
		List<Integer> idNum = new ArrayList <Integer>();
		
		List <String> mentors = new ArrayList <String>();
		
		
		//m1- add method
		mentors.add("Manoj");
		mentors.add("imbk");
		mentors.add("in");
		mentors.add("manoj");
		
		System.out.println(mentors);
		
		//m2- size
		
	int size = mentors.size();
		System.out.println(size);
		
		// m3-index is starts from 0
		
		mentors.add(3, "raj");
		System.out.println(mentors);
		
		//m4- get
		String string = mentors.get(2);
		System.out.println(string);
		
		//m8-contains
		boolean contains = mentors.contains("imbk");
		System.out.println(contains);
		
		//m5-remove
		String remove = mentors.remove(2);
		System.out.println(remove);
		System.out.println(mentors);
		
		//m6-clear
		mentors.clear();
		System.out.println(mentors);
		
	    //m7- isEmpty
		
		boolean empty = mentors.isEmpty();
		System.out.println(empty);
		
	}

}
