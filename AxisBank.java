package javaoops;

public class AxisBank extends BankInfo{

	public void deposit(int k) {
		System.out.println("Axis bank deposit overrided is "+k);
	}
	
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposit(500);
		a.fixed(200);
		a.saving(600);
		
	}
}
