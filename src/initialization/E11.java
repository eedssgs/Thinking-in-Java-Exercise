package initialization;

public class E11 {
	protected void finalize() {
		System.out.println("finalized");
	}

	public static void main(String args[]) {
		new E11();
		/*
		 * Calling System.gc( ) and System.runFinalization( ) in sequence will
		 * probably but not necessarily call your finalizer (The behavior of finalize has been
		 * uncertain from one version of JDK to another.) The call to these methods is just
		 * a request; it doesn¡¯t ensure the finalizer will actually run. Ultimately, nothing
		 * guarantees that finalize( ) will be called. 
		 */
		System.gc();
		System.runFinalization();
	}
}
