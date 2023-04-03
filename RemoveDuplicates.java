package Assignment2;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String text ="We learn java basics as part of java week1";
		String[]split= text.split(" ");
		for (int i = 0; i < split.length; i++) {
			int count = 0;
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count++;
				if(count>0) {
					split[j]="";
					
				}
				}
			}
		}
		
	

	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	}
}
