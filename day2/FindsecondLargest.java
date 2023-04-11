package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindsecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		Collections.sort(arr);
		int size = arr.size();
		
		System.out.println("The second last value is : " +arr.get(size-2));
		
		for(int i=0;i<size;i++)
		{
			System.out.print(arr.get(i) +"  ");
		}
		
		
 
	}
		
		
		
		
	}

