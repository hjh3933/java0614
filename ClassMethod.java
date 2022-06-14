package org.java.oop;

public class ClassMethod {
	
	public int n1;
	public int n2;
	public static int n3;
	
	public void s1() {
		n1=1;
		n3=3;
		//모두 가능
	}
	public static void s2() {
		//n1=1;		error static은 pubilc호출 불가능
	}
	
	//매서드 유형1
	public void method1() {
		System.out.println("반환값이 없고 입력값이 없다");
		return;	//생략가능
	}
	
	//메서드 유형2
	public void method2(int num1, int num2) {
		System.out.println(num1+"+"+num2+"="+(num1 + num2));
		int sum = num1 + num2;
	}
	
	//메서드 유형3
	public int method3() {
		int sum = 10 + 200;
		return sum;	//int값만 내보내기 가능
	}
	//메서드 유형4
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	//클래스 메소드
	public static void staticMethod() {
		System.out.println("클래스 메서드");
	}
	public static void staticMethod2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
}
