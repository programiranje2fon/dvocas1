package zadatak2;

class Radio {
	
	boolean ukljucen = false;
	double trenutnaFrekvencija = 87.5;
	
	void ukljuci() {
		ukljucen = true;
	}

	void iskljuci() {
		ukljucen = false;
	}
	
	void promeniFrekvencijuNavise() {
		trenutnaFrekvencija = trenutnaFrekvencija + 0.1;
	}
	
	void promeniFrekvencijuNanize() {
		trenutnaFrekvencija = trenutnaFrekvencija - 0.1;
	}
	
	void postaviFrekvenciju(double frekvencija) {
		trenutnaFrekvencija = frekvencija;
	}
	
	boolean daLiJeUkljucen() {
		return ukljucen;
	}
	
	double vratiTrenutnuFrekvenciju() {
		return trenutnaFrekvencija;
	}
	
	void ispisi() {
		System.out.println("Radio je ukljucen: " + ukljucen);
		System.out.println("Trenutna frekvencija je: " + trenutnaFrekvencija);
	}
}
