package week3.day1;

public class Students {
	
	public int getStudentInfo(int id) {
		return id;
		
	}
	public void getStudentInfo() {
		int id =599;
		String name="Manoj";
		System.out.println("The name of the student with ID"+id+ " is "+name);
		
	}
	public String getStudentInfo(String email, String phoneNumber) {
		return email+"/n"+phoneNumber;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Students st= new Students();
	System.out.println(st.getStudentInfo(18002160));
	st.getStudentInfo();
	System.out.println(st.getStudentInfo("manojmukunthavasan@gmail.com", "938456366"));

	}

}
