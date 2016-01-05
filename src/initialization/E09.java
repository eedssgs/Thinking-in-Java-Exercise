package initialization;

public class E09 {
	E09(String s) {
		System.out.println("s = " + s);
	}

	E09(int i) {
		this("i = " + i);
	}
	
	public static void main(String args[]){
		new E09("first");
		new E09(24);
	}
}
