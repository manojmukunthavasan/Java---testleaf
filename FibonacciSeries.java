package week2.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
  int n=8, f=0, s=1,sum=0;
  System.out.println(f);
  System.out.println(s);
  for (int i = 1; i <=n; i++) {
	  sum=f+s;
	  System.out.println(sum);
	  f=s;
	  s=sum;
	
}
}
}