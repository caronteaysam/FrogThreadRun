
public class FrogThread extends Thread {
	
	private static int JUMP_MAX = 50;
	private static int RACE_LEN = 500;
	private static int POS = 1;
	
	private int distance = 0;
	
	public FrogThread ( ) {}
	
	private boolean jump ( ) {
		
		int rand_int = (int)( Math.random ( ) * FrogThread.JUMP_MAX );
		this.distance += rand_int;
		
		System.out.printf ( "Frog %d pulou %d metros e percorreu %d no total.\n", this.getId ( ), rand_int, this.distance );

		if ( this.distance > FrogThread.RACE_LEN ) {
			
			System.out.println ( "=======================================" );
			System.out.printf  ( "Frog %d terminou a corrida em %dº lugar.\n", this.getId ( ), FrogThread.POS );
			System.out.println ( "=======================================" );
			FrogThread.POS++;
			
			return false;
		}
		return true;
	}
	
	@Override
	public void run ( ) {
		
		while ( this.jump ( )) {
		
			try {
				this.sleep ((int)( Math.random ( ) * 1500 ));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
