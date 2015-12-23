package object;

public class E01 {
	int i;
	char c;
	public E01(){
		System.out.println("i = "+i);
		System.out.println("c = ["+c+"]");
	}
	public static void main(String[] args){
//		int a; // this is false, it needs to be initialed
		int a = 1;
		new E01();
		System.out.println(a);
	}
}
