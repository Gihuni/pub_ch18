package kh.consumer;

import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {
		// 인터페이스 -> 구현클래스 -> 구현객체 -> 부자관계 -> 부.추상메소드
		// Consumer X -> x -> 구현객체(부자관계까지 포함) -> 부.추상메소드

		Consumer<String> con = t -> System.out.printf("%s 님 환영합니다.\n", t);
		con.accept("홍길동");
		con.accept("구길동");
		con.accept("저길동");

		Consumer<Integer> conInt = t -> {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", t, i, t * i);
			}

		};

		conInt.accept(6);

		System.out.println("The end");

	}

}
