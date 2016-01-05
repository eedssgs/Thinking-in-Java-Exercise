package initialization;

public class E04 {
	E04() {
		System.out.println("Default constructor");
	}

	E04(String s) {
		System.out.println("String arg constructor");
		System.out.println(s);
	}

	public static void main(String[] args) {
		new E04();
		new E04("Over Load");
	}
}
