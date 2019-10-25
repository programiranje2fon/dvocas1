package zadatak2;

class ProbaRadio {

	public static void main(String[] args) {
		Radio r = new Radio();
        
        r.ispisi();
        r.ukljuci();
        r.trenutnaFrekvencija = 107.3;
        r.ispisi();
        r.promeniFrekvencijuNavise();
        r.ispisi();
        r.promeniFrekvencijuNanize();
        r.ispisi();
        r.ukljuci();
        r.ispisi();
        r.iskljuci();
        r.ispisi();
        
        double trenutnaFrekvencija = r.vratiTrenutnuFrekvenciju();
        
        System.out.println("Trenutna frekvencija na radiju je "+trenutnaFrekvencija);
        
        boolean trenutnoUkljucen = r.daLiJeUkljucen();
        
        System.out.println("Radio je trenutno ukljucen "+trenutnoUkljucen);

	}

}
