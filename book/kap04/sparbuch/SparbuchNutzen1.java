class Sparbuch	{
	double kapital, zinssatz;
	
	Sparbuch(double kap, double zins)	{
		kapital = kap;
		zinssatz = zins;
	}
	
	void einzahlen(double betrag)	{
		kapital += betrag;
	}
	
	void abheben(double betrag)	{
		kapital -= betrag;
	}
	
	double ertragZ(double laufzeit)	{
		return kapital * Math.pow((1 + zinssatz / 100), laufzeit);
	}
	
	double ertrag(double laufzeit)	{
		return kapital * (1 + zinssatz / 100 * laufzeit);
	} 	
}

class SparbuchNutzen1 {
	public static void main(String[] args)	{
		Sparbuch meinSparbuch = new Sparbuch(0,3);
		meinSparbuch.einzahlen(10000);
		
		System.out.println("Ertrag nach 5 Jahren : ");
		System.out.printf("ohne Zinseszins\t: %,.2f EUR\n", meinSparbuch.ertrag(5));
		System.out.printf("mit Zinseszins\t: %,.2f EUR\n", meinSparbuch.ertragZ(5));
	}
}










