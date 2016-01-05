package initialization;

public class E05 {
	public boolean print(int i) {
		System.out.println("return boolean with i = " + i);
		return true;
	}

	public long print(int i,int j) {
		System.out.println("return long with i = " + i + j);
		return (long)1.8;
	}
	public static void main(String[] args){
		E05 s = new E05();
		long a = s.print(1,2);
		boolean b = s.print(1);
		System.out.println(a + "-" + b);
	}
}
