package org.java.oop;

public class ClassMain {
	public static void main(String[] args) {
		
		//�ν��Ͻ�ȭ, ��üȭ
		//new ��ü���� ������
		//c1 = ��ü�� �ּ�
		//��ü.	->��ü ���� ������
		Class1 c1 = new Class1();
		//num1 , num2, key�� �ʱ�ȭ�ϰ� �ֿܼ� ���
		c1.num1 = 1;
		c1.num2 = 1;
		c1.setKey("�̰��� key�Դϴ�");	//private�ʱ�ȭ
		String c1Key = c1.getKey();	//private��������
		//c1.ClassMethod(); instanceȭ�� �����͵� �Ǳ���
		
		Class1 c2 = new Class1();
		c2.num1 = 2;
		c2.num2 = 2;
		
		System.out.println("c1.num1 : "+c1.num1);
		System.out.println("c1.num2 : "+c1.num2);
		System.out.println("c1Key : "+c1Key);
		
		System.out.println("c2.num1 : "+c2.num1);
		System.out.println("c2.num2 : "+c2.num2);
		
		//Class member static -> instance����  ��� ����
		Class1.ClassMethod();
		System.out.println(Class1.PROJECTNAME);
		
		c1.setKey("kk");
		//String keke = c1.getKey();
		
		
		
	}
}
