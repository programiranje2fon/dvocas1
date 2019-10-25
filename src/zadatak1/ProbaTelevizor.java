package zadatak1;

class ProbaTelevizor {

	public static void main(String[] args) {
		Televizor t = new Televizor();
		int trenutna_jacina_tona;

		t.ukljuci();
		t.ispisi();
		t.pojacajTon();
		t.ispisi();
		t.smanjiTon();
		t.ispisi();
		t.promeniProgram(5);
		t.ispisi();

		trenutna_jacina_tona = t.vratiJacinuTona();

		System.out.println("Trenutno, jacina tona na televizoru iznosi " + trenutna_jacina_tona);
	}

}
