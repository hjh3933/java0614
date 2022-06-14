package org.java.oop;

public class ClassMain {
	public static void main(String[] args) {
		
		//인스턴스화, 객체화
		//new 객체생성 연산자
		//c1 = 객체의 주소
		//객체.	->객체 접근 연산자
		Class1 c1 = new Class1();
		//num1 , num2, key를 초기화하고 콘솔에 출력
		c1.num1 = 1;
		c1.num2 = 1;
		c1.setKey("이것은 key입니다");	//private초기화
		String c1Key = c1.getKey();	//private가져오기
		//c1.ClassMethod(); instance화로 데려와도 되긴함
		
		Class1 c2 = new Class1();
		c2.num1 = 2;
		c2.num2 = 2;
		
		System.out.println("c1.num1 : "+c1.num1);
		System.out.println("c1.num2 : "+c1.num2);
		System.out.println("c1Key : "+c1Key);
		
		System.out.println("c2.num1 : "+c2.num1);
		System.out.println("c2.num2 : "+c2.num2);
		
		//Class member static -> instance없이  사용 가능
		Class1.ClassMethod();
		System.out.println(Class1.PROJECTNAME);
		
		c1.setKey("kk");
		//String keke = c1.getKey();
		
		
		
	}
}
