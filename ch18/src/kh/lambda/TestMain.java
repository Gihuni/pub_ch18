package kh.lambda;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		// 구현객체를 생성한다.
		TestChild tc = new TestChild();

		// 부자관계
		Test test = tc;

		// 다형성을 구현한다.
		int kor = test.methodTest("국어");
		System.out.printf("국어 점수는 %d 입니다.\n", kor);
		System.out.println("======================");
		
		
		Test test2 = a -> {
			Scanner scan = new Scanner(System.in);
			System.out.printf("%s 점수요청 : ", a);
			int value = Integer.parseInt(scan.nextLine());
			return value;
		};
		int eng = test2.methodTest("영어");
		System.out.printf("영어점수 = %d\n", eng);

		System.out.println("The end");
	}

}
