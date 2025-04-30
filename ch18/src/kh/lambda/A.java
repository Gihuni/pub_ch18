package kh.lambda;

public interface A {
	// 입력 없다, 리턴 없다
	public abstract void method();

}

// 입력 있고, 리턴 있다
interface D {
	public abstract double methodD(int b, double c);
}

interface E {
	// 입력 없고, 리턴 있다
	int methodE();
}

interface F {
	// 입력 있고, 리턴 없다
	void methodF(int a);
}