package zadatak2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import zadatak2.Radio;

public class RadioTest {
	
	Radio r;

	@Before
	public void setUp() throws Exception {
		r = new Radio();
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}

	@Test
	public void atribut_ukljucen() {
		assertEquals("Početna vrednost atributa ukljucen bi trebalo da bude false, ali je "+r.ukljucen, false, r.ukljucen);
	}
	
	@Test
	public void atribut_trenutnaFrekvencija() {
		assertEquals("Početna vrednost atributa frekvencija bi trebalo da bude 87.5, ali je "+r.trenutnaFrekvencija, 87.5, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void metoda_promeniFrekvencijuNavise() {
		r.trenutnaFrekvencija = 99.7;
		
		r.promeniFrekvencijuNavise();
		
		assertEquals("Kad je trenutnaFrekvencija 99.7 i pozove se metoda, frekvencija ne postane 99.8, već " + r.trenutnaFrekvencija, 99.8, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void metoda_promeniFrekvencijuNanize() {
		r.trenutnaFrekvencija = 99.3;
		
		r.promeniFrekvencijuNanize();
		
		assertEquals("Kad je trenutnaFrekvencija 99.3 i pozove se metoda, frekvencija ne postane 99.2, već " + r.trenutnaFrekvencija, 99.2, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void metoda_postaviFrekvenciju() {
		r.trenutnaFrekvencija = 107.9;
		
		r.postaviFrekvenciju(99.1);
		
		assertEquals("Kad je trenutnaFrekvencija 107.9 i pozove se metoda sa vrednošću 99.1, frekvencija ne postane 99.1, već " + r.trenutnaFrekvencija, 99.1, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void metoda_vratiTrenutnuFrekvenciju() {
		r.trenutnaFrekvencija = 100.0;
		
		assertEquals("Kad je trenutna frekvencija 100 i pozove se metoda, ona ne vraća 100, već "+r.vratiTrenutnuFrekvenciju(),100.0, r.vratiTrenutnuFrekvenciju(), 0.0001);
	}
	
	@Test
	public void metoda_ukljuci() {
		r.ukljucen = false;
		
		r.ukljuci();
		
		assertEquals("Kad je ukljucen false i pozove se metoda, ukljucen ne postane true, već "+r.ukljucen,true, r.ukljucen);
	}
	
	@Test
	public void metoda_iskljuci() {
		r.ukljucen = true;
		
		r.iskljuci();
		
		assertEquals("Kad je ukljucen true i pozove se metoda, ukljucen ne postane false, već "+r.ukljucen, false, r.ukljucen);
	}
	
	@Test
	public void metoda_daLiJeUkljucen() {
		r.ukljucen = true;
		
		assertEquals("Kad je ukljucen true i pozove se metoda, ona ne vraća true, već "+r.ukljucen, true, r.daLiJeUkljucen());
	}
	
	

}
