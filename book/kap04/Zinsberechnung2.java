public class Zinsberechnung2 {
	
	public static double zinsBerechnen(double startkapital, double zinssatz, double laufzeit){
		
		double endkapital;
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),laufzeit);
		
		return endkapital;
		
	}
	
	public static void main(String[] args){
		
		double startkapital = 4000;
		double zinssatz = .2;
		double laufzeit = 5;
		double endkapital, gewinn;
		
		
		for(int i = 0; i < laufzeit + 1; i++){
			endkapital = zinsBerechnen(startkapital, zinssatz, i);	
			System.out.printf("Kapital nach dem %d.Jahr: %,.2fEUR | ", i, endkapital);
			gewinn = endkapital - startkapital;
			System.out.printf("Gewinn: %,.2fEUR\n", gewinn);
		}

		
		/*
		System.out.printf("Kapital nach dem %.0f .Jahr: %,.2fEUR\n", laufzeit, endkapital);
		gewinn = endkapital - startkapital;
		System.out.printf("Gewinn: %,.2fEUR\n\n", gewinn);
		*/
		
	}
	
}