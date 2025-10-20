package zadatak2;

class Radio {
	
	boolean ukljucen = false;
	
	double trenutnaFrekvencija = 87.5;
	
	void promeniFrekvencijuNavise() {
		trenutnaFrekvencija = trenutnaFrekvencija + 0.1;
	}
	
	void promeniFrekvencijuNanize() {
		trenutnaFrekvencija = trenutnaFrekvencija - 0.1;
	}
	
	void postaviFrekvenciju(double frekvencija) {
		trenutnaFrekvencija = frekvencija;
	}
	
	double vratiTrenutnuFrekvenciju() {
		return trenutnaFrekvencija;
	}
	
	void ukljuci() {
		ukljucen = true;
	}

	void iskljuci() {
		ukljucen = false;
	}

	boolean daLiJeUkljucen() {
		return ukljucen;
	}
	
	void ispisi() {
		System.out.println("Radio je ukljucen: " + ukljucen);
		System.out.println("Trenutna frekvencija je: " + trenutnaFrekvencija);
	}
}
