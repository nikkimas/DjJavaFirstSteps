class schleife1 {
	public static void main(String[] args) {
		int i;
		
		//for-Schleife
		for(i = 1; i <= 10; i++){
			System.out.println( "i: " + i );
		}
		System.out.println("###########################" );
		//das Gleiche als while-Schleife
		i = 1;
		while( i <= 10 ) {
			System.out.println("i: " + i );
			i++;
		}
		
	}
}