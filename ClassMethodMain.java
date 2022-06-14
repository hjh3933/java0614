package org.java.oop;

public class ClassMethodMain {
	
	public int s1;
	public int s2;
	public static int s3;
	public void m1() {
		s1 = 10;
		s2 = 20;
		s3 = 30;	//instance메서드 static, instance모두 호출가능
	}
	
	public static void main(String[] args) {
		
		//s1=10;	에러발생 
		s3=100;	//static만 호출가능
		
		ClassMethod c1 = new ClassMethod();

		c1.method1();
		c1.method2(100, 200);
		
		int sum = c1.method3();
		System.out.println(sum);
		
		int sum1 = c1.method4(100, 50);
		System.out.println(sum1);
	
		//클래스 메서드 호출
		ClassMethod.staticMethod();
		ClassMethod.staticMethod2(100, 200);
	}
}
