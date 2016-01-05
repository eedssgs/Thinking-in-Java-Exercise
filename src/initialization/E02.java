package initialization;

public class E02 {
	String s1 = "initialized at definition";
	String s2;

	public E02(String s2s) {
		s2 = s2s;
	}

	public static void main(String[] args) {
		E02 si = new E02("initialized at construction");
		System.out.println("si.s1 = " + si.s1);
		System.out.println("si.s2 = " + si.s2);
	}
}
