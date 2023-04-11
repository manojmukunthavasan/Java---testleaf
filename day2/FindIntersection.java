package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List <Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		
		List<Integer> arr1=new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(8);
		arr1.add(4);
		arr1.add(9);
		arr1.add(7);
		
		int size = arr.size();
		int size1 = arr1.size();
		

		for (int i=0;i<size;i++) {
			 
			for(int j=0;j<size1;j++) {
				
				if(arr.get(i)==arr1.get(j)) {
					System.out.println(arr1.get(j));
				}
	}

		}
	}
}
