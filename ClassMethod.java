package org.java.oop;

public class ClassMethod {
	
	public int n1;
	public int n2;
	public static int n3;
	
	public void s1() {
		n1=1;
		n3=3;
		//��� ����
	}
	public static void s2() {
		//n1=1;		error static�� pubilcȣ�� �Ұ���
	}
	
	//�ż��� ����1
	public void method1() {
		System.out.println("��ȯ���� ���� �Է°��� ����");
		return;	//��������
	}
	
	//�޼��� ����2
	public void method2(int num1, int num2) {
		System.out.println(num1+"+"+num2+"="+(num1 + num2));
		int sum = num1 + num2;
	}
	
	//�޼��� ����3
	public int method3() {
		int sum = 10 + 200;
		return sum;	//int���� �������� ����
	}
	//�޼��� ����4
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	//Ŭ���� �޼ҵ�
	public static void staticMethod() {
		System.out.println("Ŭ���� �޼���");
	}
	public static void staticMethod2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
}
