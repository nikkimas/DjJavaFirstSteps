class Kaninchen{
	public static void main(String[] args){
		double pop = 2;
		
		System.out.println("Angabe in Jahren\n");
		
		for( float jahr = 1; jahr <= 10; jahr++ ){
			pop = 2*Math.exp(Math.log(15)*jahr);
			System.out.printf("[%.0f] Ca. %,.0f Kanickel\n", jahr, pop);
		}
	}
}