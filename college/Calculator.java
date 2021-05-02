package org.college;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cals=new Calculator();
		
		cals.add(7, 4);
		cals.add(1, 8, 4);
		
		cals.multiply(78, 95);
		cals.multiply(78, 46.45);
		
		cals.subtract(79, 49);
		cals.subtract(46, 45.12);
		
		cals.divide(79, 46);
		cals.divide(14, 7);
	}	
		public void add(int a,int b)
		{
			
			int c =a+b;
			System.out.println(c);
		}
		
		public void add(int a,int b, int c)
		{
			int d =a+b+c;
			System.out.println(d);
			
		}
		
		public void multiply(int a,int b)
		{
			int d =a*b;
			System.out.println(d);
		}
		
		public void multiply(int a,double b )
		{
			double d =a*b;
			System.out.println(d);
			
		}
		
		public void subtract(int a,int b)
		{
			int d =a-b;
			System.out.println(d);
		}
		
		public void subtract(double b,double c )
		{
			double d =b-c;
			System.out.println(d);
			
		}
		
		public void divide (int a,int b)
		{

			int d =a/b;
			System.out.println(d);
			
		}
		
		public void divide (int c,double d )
		{

			double e =c/d;
			System.out.println(e);
			
		}
		
	
			
			
		
		
	}

	


