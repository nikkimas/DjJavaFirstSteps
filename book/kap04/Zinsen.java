public class Zinsen{
	
	public static void zinsBerechnen(double laufzeit){
		double startkapital = 15000, zinssatz = 3.5, endkapital, gewinn;
		
		endkapital = startkapital * Math.pow((1 + zinssatz/100),laufzeit);
		
		System.out.printf("Kapital nach dem %.0f .Jahr: %,.2fEUR\n", laufzeit, endkapital);
		gewinn = endkapital - startkapital;
		System.out.printf("Gewinn: %,.2fEUR\n\n", gewinn);
		
	}
	
	public static void main(String[] args){
		
		zinsBerechnen(1);
		zinsBerechnen(2);
		zinsBerechnen(3);
		zinsBerechnen(4);
		zinsBerechnen(5);
		zinsBerechnen(6);
		zinsBerechnen(7);
		
		
	}
	
}