package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit amount is 10Lakhs");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AxisBank ab= new AxisBank();
        ab.saving();
        ab.fixed();
        ab.deposit();
		
		
	}

}
