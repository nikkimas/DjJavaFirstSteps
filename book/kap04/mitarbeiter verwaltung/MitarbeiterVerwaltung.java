public class MitarbeiterVerwaltung {
	public static void main(String[] args){
		Mitarbeiter[] personalliste = new Mitarbeiter[4];
		int mitarbeiterzahl;
		
		personalliste[0] = new Mitarbeiter("Marx", "Geoucho", 8000);
		personalliste[1] = new Mitarbeiter("Marx", "Chico", 7000);
		personalliste[2] = new Mitarbeiter("Marx", "Harpo", 7000);
		personalliste[3] = new Mitarbeiter("Marx", "Zeppo", 7000);
		mitarbeiterzahl = 4;
		
		for( int i = 0; i < personalliste.length; i++ ){
			personalliste[i].datenAusgeben();
		}
		
		System.out.println("#####################");
		
		for(Mitarbeiter m: personalliste){
			m.datenAusgeben();
		}
		
	}
}