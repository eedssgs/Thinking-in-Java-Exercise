package initialization;

public class E12 {
	static int counter;
	int id = counter++;
	boolean full;

	public E12() {
		System.out.println("E12 " + id + " created.");
		full = true;
	}

	public void empty() {
		full = false;
	}
	protected void finalize(){
		if (full){
			System.out.println("Error: E12 " + id + " must be empty at cleanup");
		}else{
			System.out.println("E12 " + id + " clean up ok");
		}
	}
	public static void main (String[] args){
		E12 a = new E12();
		a.empty();
		E12 b = new E12();
		a = null;
		b = null;
		System.gc();
		System.runFinalization();
	}
}
