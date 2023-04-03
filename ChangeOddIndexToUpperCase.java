package Assignment2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String test= "changeme";
       char[] ch= test.toCharArray();
       for (int i = 0; i < ch.length; i++) {
		if(i%2==0) {
			ch[i]= Character.toUpperCase(ch[i]);
			System.out.println(ch[i]);
		}else if(i%2==1) {
			System.out.println(ch[i]);
		}
       }
	}

}
