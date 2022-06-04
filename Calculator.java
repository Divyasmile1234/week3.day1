package week3.day1.classroom;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Calculator calc= new Calculator();
		calc.add(1, 2);
		calc.add(01, 02, 03);
		calc.sub(40, 20);
		calc.sub(30, 0);
		calc.mul(10, 05);
		calc.mul(5, 80);
	}
      public void add(int a,int b)
      {
    	  System.out.println(a+b);
      }
      public void add(int a,int b,int c)
      {
    	  System.out.println(a+b+c);
      }
      public void sub(int a,int b)
      {
    	  System.out.println(a-b);
      }
      public void sub(double a,double b)
      {
    	  System.out.println(a-b);
      }
      public void mul(int a, int b)
      {
    	  System.out.println(a*b);
      }
      public void mul(double a,int b)
      {
    	  System.out.println(a*b);
      }
      }