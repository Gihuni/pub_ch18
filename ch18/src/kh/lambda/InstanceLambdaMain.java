package kh.lambda;

public class InstanceLambdaMain {

	public static void main(String[] args) {
		// 람다식(함수형 인터페이스 -> 인스턴스메소드 System.out.Println()
		F f = a -> System.out.println(a);

		F f2 = System.out::println;

		f.methodF(10);
		f2.methodF(100);
		System.out.println("=========================");

		A a = () -> Bobject.bcd();
		A a2 = Bobject::bcd;

		a.method();
		a2.method();
		System.out.println("=========================");

		Atest atest = (b, k) -> b.bcd(k);
		Atest atest2 = BObject2::bcd;

		atest.abc(new BObject2(), 10000);
		atest2.abc(new BObject2(), 20000);

		System.out.println("The end");
	}
}
