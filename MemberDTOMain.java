package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDTOMain {
	public static void main(String[] args) {

		MemberDTO member1 = new MemberDTO();

		member1.setUserId("root");
		member1.setUserPw("1111");
		member1.setUserName("m111");
		member1.setUserAge(24);
		member1.setUserAddr("서울시 노원구");
		member1.setUserPhone("010-1234-5678");
		member1.setDay(new Date());

		String userId = member1.getUserId();
		String userPw = member1.getUserPw();
		String userName = member1.getUserName();
		int userAge = member1.getUserAge();
		String userAddr = member1.getUserAddr();
		String userPhone = member1.getUserPhone();
		Date day = member1.getDay();

		// 날짜 형식을 세팅하는 것(아직 안배움)
		SimpleDateFormat sDay = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");	//월은 MM 분은 mm
		String now = sDay.format(day);

		System.out.println("아이디: " + userId);
		System.out.println("비밀번호: " + userPw);
		System.out.println("이름: " + userName);
		System.out.println("나이: " + userAge);
		System.out.println("주소: " + userAddr);
		System.out.println("전화번호: " + userPhone);
		System.out.println("날짜: " + now);
		
		System.out.println(member1.toString());
		System.out.println("===============================");
		
		MemberDTO member2 = new MemberDTO();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		member2.setUserId(scn.next());
		System.out.println("비밀번호를 입력하세요");
		member2.setUserPw(scn.next());
		System.out.println("이름을 입력하세요");
		member2.setUserName(scn.next());
		System.out.println("나이를 입력하세요");
		member2.setUserAge(scn.nextInt());
		System.out.println("주소를 입력하세요");
		member2.setUserAddr(scn.next());
		System.out.println("전화번호를 입력하세요");
		member2.setUserPhone(scn.next());
		
		member2.setDay(new Date());	//현재시간
		
		System.out.println("아이디: " + member2.getUserId());
		System.out.println("비밀번호: " + member2.getUserPw());
		System.out.println("이름: " + member2.getUserName());
		System.out.println("나이: " + member2.getUserAge());
		System.out.println("주소: " + member2.getUserAddr());
		System.out.println("전화번호: " + member2.getUserPhone());
		System.out.println("날짜: " + sDay.format(member2.getDay()));
		

	}
}
