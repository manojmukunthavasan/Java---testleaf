package week3.day2;

public class Automation extends MultipleLanguages {


	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Learning java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Learning selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("learning ruby");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation at = new Automation();
		at.java();
		at.Selenium();
		at.ruby();
		at.python();
		
	}
}
