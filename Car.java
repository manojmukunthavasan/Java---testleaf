package week1.day1;

public class Car {
	 
	public void driveCar() {
		System.out.println("I drive my car");
	}
		public void applyBrake() {
			System.out.println("I apply the brake");
		}
		public void soundHorn() {
			System.out.println("My friend pressed the Horn");
		}
	    public void   isPuncture() {
	    	System.out.println("My car tyre is punchered");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Car drive= new Car();
		drive.driveCar();
		drive.applyBrake();
		drive.soundHorn();
		drive.isPuncture();
    
	}

}
