class SparbuchNutzen2 {
	public static void main(String[] args)	{
		Sparbuch meinSparbuch = new Sparbuch(0,3);
		meinSparbuch.einzahlen(10000);
		
		System.out.println("Ertrag nach 5 Jahren : ");
		System.out.printf("ohne Zinseszins\t: %,.2f EUR\n", meinSparbuch.ertrag(5));
		System.out.printf("mit Zinseszins\t: %,.2f EUR\n", meinSparbuch.ertragZ(5));
	}
}