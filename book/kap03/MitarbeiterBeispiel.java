class Mitarbeiter{
	String m_name;
	String m_vorname;
	int m_gehalt;
	
	Mitarbeiter(String name, String vorname, int gehalt){
		m_name = name;
		m_vorname = vorname;
		m_gehalt = gehalt;
	}
	
	void datenAusgeben() {
		System.out.print("\n");
		System.out.println("Name	: " + m_name);
		System.out.println("Vorname	: " + m_vorname);
		System.out.println("Gehalt	: " + m_gehalt + " EUR");
	}
	
	void gehaltErhoehen(int erhoehung){
		m_gehalt += erhoehung;
	}
}

public class MitarbeiterBeispiel {
	public static void main(String[] args)	{
		//2 neue Mitarbeiter Instanzieren
		
		Mitarbeiter billy		= new Mitarbeiter("Gates", "Bill", 3000);
		Mitarbeiter stevie	= new Mitarbeiter("Jobs", "Steve", 3500);
		
		//Daten ausgeben
		billy.datenAusgeben();
		stevie.datenAusgeben();
		
		//Gehalt erhöhen
		billy.gehaltErhoehen(4000);
		
		//Kontrolle
		billy.datenAusgeben();
		stevie.datenAusgeben();
		
		//My own test
		System.out.print(billy.m_gehalt); //Note: Kann direkt auf Klassen-Globale Var. zugreifen mit klasse.varName
		
	}
}




















