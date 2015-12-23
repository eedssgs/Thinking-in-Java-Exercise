package object;

public class E08 {
	static int i = 47;

	public static void main(String[] args) {
		E08 a = new E08();
		E08 b = new E08();
		System.out.println(a.i + " == " + b.i);
		i++;
		System.out.println(a.i + " == " + b.i);
	}
}
