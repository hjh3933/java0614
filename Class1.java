package org.java.oop;

public class Class1 {
	public int num1;
	public int num2;
	private String key;	//���� �Ұ���, �����Ϸ��� setters, getters�ʿ�
	public final static String PROJECTNAME = "JAVAPROJECT2022";
	
	public void instansMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �޼���");
	}
	public int instansMethod2() {
		System.out.println("return�� int �ν��Ͻ� �޼���");
		return this.num1+this.num2;
	}
	
	public static void ClassMethod() {	//void = return���� ���ٴ� ��
		System.out.println("Ŭ�����޼���");
		//return; -> return���� ���� �� �̷��� ������ �׳� ����
	}
	
	//setters -> private��� �ʱ�ȭ
	public void setKey(String key) {
		this.key=key;
	}
	//getters -> private��� get 
	public String getKey() {
		return this.key;
	}
}
