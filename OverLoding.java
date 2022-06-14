package org.java.oop;

public class OverLoding {

	public void method() {
		System.out.println("메서드");
	}
	//반환타입이 상이해도 인정하지 않는다
	/*public int method() {
		return 0;
	}*/
	
	//매개변수의 개수와 타입, 위치가 오버로딩을 결정하는 요소! 나머지는 상관없음 
	public void method(int num1, String name) {
		System.out.println(num1+name);
	}	//타입다름
	
	public void method(int num1) {
		System.out.println(num1);
	}	//개수다름
	
	//매개변수의 이름이 달라도 타입과 개수가 같으면 허용 불가
	/*public void method(int num2, String name) {
		System.out.println(num1+name);
	}*/
	
	//타입, 개수 같아도 위치 다르면 허용
	public void method( String name, int num1) {
		System.out.println(name+num1);
	}
	
	
	
}
