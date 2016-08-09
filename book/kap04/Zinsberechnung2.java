public class Zinsberechnung2 {
	
	public static double zinsBerechnen(double startkapital, double zinssatz, double laufzeit){
		
		double endkapital;
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),laufzeit);
		
		return endkapital;
		
	}
	
	public static void main(String[] args){
		
		double startkapital = 15000;
		double zinssatz = 3.5;
		double laufzeit = 7;
		double endkapital, gewinn;
		
		endkapital = zinsBerechnen(startkapital, zinssatz, laufzeit);
		
		System.out.printf("Kapital nach dem %.0f .Jahr: %,.2fEUR\n", laufzeit, endkapital);
		gewinn = endkapital - startkapital;
		System.out.printf("Gewinn: %,.2fEUR\n\n", gewinn);
		
	}
	
}