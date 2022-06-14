package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		// �� ���ڿ� �����ڸ� �Է¹޾Ƽ� ������ �޼��带 ����
		// while���� �̿��ؼ� ���ѹݺ� -> z�Է��ϸ� while�� ����
		// �� ���� �Է½� setter
		// + sum(), - sub(), / div(), * multi()�� ȣ��ǵ��� �غ�����
		Calculator1 cal = new Calculator1();
		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("ù ��° ���ڸ� �Է��ϼ���");
			int num1 = scn.nextInt();
			System.out.println("�� ��° ���ڸ� �Է��ϼ���");
			int num2 = scn.nextInt();
			System.out.println("�����ڸ� �Է��ϼ���");
			String op = scn.next();

			cal.setNum1(num1);
			cal.setNum2(num2);

			if (op.equals("+")) {
				cal.add();
			} else if (op.equals("-")) {
				System.out.println(cal.getNum1() + "-" + cal.getNum2() + "=" + cal.sub());
			} else if (op.equals("/")) {
				System.out.println(cal.getNum1() + "/" + cal.getNum2() + "=" + cal.div());
			} else if (op.equals("*")) {
				System.out.println(cal.getNum1() + "*" + cal.getNum2() + "=" + cal.multi());
			} else if (op.equals("z")) {
				break;
			} else {
				System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�");
			}
		}

		scn.close();
	}

}
