package initialization;

public class E08 {
	public void a() {
		bark();
		this.bark();
	}

	public void bark() {
		System.out.println(s);
	}

	String s;
	
	public static void main(String[] args) {
		E08 a = new E08();
		a.s = "this is a";
		E08 b = new E08();
		b.s = "this is b";
		a.a();
		b.a();
	}
}
