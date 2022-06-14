package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		// 두 숫자와 연산자를 입력받아서 각각의 메서드를 실행
		// while문을 이용해서 무한반복 -> z입력하면 while문 종료
		// 두 숫자 입력시 setter
		// + sum(), - sub(), / div(), * multi()가 호출되도록 해보세요
		Calculator1 cal = new Calculator1();
		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("첫 번째 숫자를 입력하세요");
			int num1 = scn.nextInt();
			System.out.println("두 번째 숫자를 입력하세요");
			int num2 = scn.nextInt();
			System.out.println("연산자를 입력하세요");
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
				System.out.println("잘못된 연산자를 입력하셨습니다");
			}
		}

		scn.close();
	}

}
