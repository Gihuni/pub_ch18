package kh.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerMain {

	public static void main(String[] args) {
		// 인터페이스 -> 구현클래스 -> 구현객체 -> 부자관계 -> 부.추상메소드
		// Consumer X -> x -> 구현객체(부자관계까지 포함) -> 부.추상메소드

		Consumer<String> con = t -> System.out.printf("%s 님 환영합니다.\n", t);
		con.accept("홍길동");
		con.accept("구길동");
		con.accept("저길동");
		// =================================================================
		Consumer<Integer> con2 = t -> {
			System.out.printf("%d단 출력\n", t);
			for (int i = 0; i < 9; i++) {
				System.out.printf("%d * %d = %d\n", t, i + 1, t * (i + 1));
			}
		};
		con2.accept(5);
		// =================================================================
		IntConsumer icon = t -> {
			System.out.printf("%d단 출력\n", t);
			for (int i = 0; i < 9; i++) {
				System.out.printf("%d * %d = %d\n", t, i + 1, t * (i + 1));
			}
		};
		icon.accept(7);
		// =================================================================
		BiConsumer<String, Integer> bicon = (name, age) -> 
		System.out.printf("%s님 나이는 %d 입니다.\n", name, age);
		bicon.accept("김동진", 60);
		bicon.accept("이해연", 23);
		
		System.out.println("The end");
	}
}
