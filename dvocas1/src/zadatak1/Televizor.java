package zadatak1;


class Televizor {

	int jacinaTona = 0;
	boolean ukljucen = false;
	int program = 1;

	void pojacajTon() {
		jacinaTona = jacinaTona + 1;// alternativno: jacinaTona++;
	}

	void smanjiTon() {
		jacinaTona = jacinaTona - 1;// alternativno: jacinaTona--;
	}

	void iskljuciTon() {
		jacinaTona = 0;
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

	int vratiJacinuTona() {
		return jacinaTona;
	}

	void promeniProgram(int p) {
		program = p;
	}

	void ispisi() {
		System.out.println("Televizor je ukljucen: " + ukljucen);
		System.out.println("Jacina tona je: " + jacinaTona);
		System.out.println("Program je: " + program);
	}

}
