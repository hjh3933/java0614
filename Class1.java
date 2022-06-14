package org.java.oop;

public class Class1 {
	public int num1;
	public int num2;
	private String key;	//접근 불가능, 접근하려면 setters, getters필요
	public final static String PROJECTNAME = "JAVAPROJECT2022";
	
	public void instansMethod() {
		System.out.println("return이 없는 인스턴스 메서드");
	}
	public int instansMethod2() {
		System.out.println("return이 int 인스턴스 메서드");
		return this.num1+this.num2;
	}
	
	public static void ClassMethod() {	//void = return값이 없다는 뜻
		System.out.println("클래스메서드");
		//return; -> return값이 없을 때 이렇게 쓰지만 그냥 생략
	}
	
	//setters -> private멤버 초기화
	public void setKey(String key) {
		this.key=key;
	}
	//getters -> private멤버 get 
	public String getKey() {
		return this.key;
	}
}
