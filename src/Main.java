
public class Main {
	
	public static void main ( String args[] ) {
		
		int FROG_AMOUNT = 5;
		
		for ( int i = 0; i < FROG_AMOUNT; i++ ) new FrogThread ( ).start ( );
	}
}