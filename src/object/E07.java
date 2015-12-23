package object;

class StaticTest {
	static int i = 47;
}

public class E07 {
	static void increment() {
		StaticTest.i++;
	}

	public static void main(String[] args) {
		E07 a = new E07();
		System.out.println("i = " + StaticTest.i);
		a.increment();
		System.out.println("i = " + StaticTest.i);
		E07.increment();
		System.out.println("i = " + StaticTest.i);
		increment();
		System.out.println("i = " + StaticTest.i);
	}
}
