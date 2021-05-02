package org.student;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("print the account holder create deposit acccount ");
		
	}
	public static void main(String[]args) {
		AxisBank ba=new AxisBank();
		ba.deposit();
		ba.fixed();
		ba.savings();
		
	}
}
