package Assignment2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] data= {1,15,2,6,3};
     
     Arrays.sort(data);
     
     int length = data.length;
     System.out.println(data[length-2]);
	}
	

}