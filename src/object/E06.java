package object;

public class E06 {
	String s = "Hello, world!";
	int storage(String ss){
		return ss.length() * 2;
	}
	void print(){
		System.out.println(storage(s));
	}
	public static void main(String[] args){
		E06 s = new E06();
		s.print();
	}
}
