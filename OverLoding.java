package org.java.oop;

public class OverLoding {

	public void method() {
		System.out.println("�޼���");
	}
	//��ȯŸ���� �����ص� �������� �ʴ´�
	/*public int method() {
		return 0;
	}*/
	
	//�Ű������� ������ Ÿ��, ��ġ�� �����ε��� �����ϴ� ���! �������� ������� 
	public void method(int num1, String name) {
		System.out.println(num1+name);
	}	//Ÿ�Դٸ�
	
	public void method(int num1) {
		System.out.println(num1);
	}	//�����ٸ�
	
	//�Ű������� �̸��� �޶� Ÿ�԰� ������ ������ ��� �Ұ�
	/*public void method(int num2, String name) {
		System.out.println(num1+name);
	}*/
	
	//Ÿ��, ���� ���Ƶ� ��ġ �ٸ��� ���
	public void method( String name, int num1) {
		System.out.println(name+num1);
	}
	
	
	
}
