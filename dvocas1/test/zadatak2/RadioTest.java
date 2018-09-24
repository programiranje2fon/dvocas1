package zadatak2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RadioTest {
	
	private Radio r;

	@Before
	public void setUp() throws Exception {
		r = new Radio();
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}

	@Test
	public void ukljucenPocetnaVrednost() {
		assertEquals(false, r.ukljucen);
	}
	
	@Test
	public void trenutnaFrekvencijaPocetnaVrednost() {
		assertEquals(87.5, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void promeniFrekvencijuNavise() {
		r.trenutnaFrekvencija = 99.7;
		
		r.promeniFrekvencijuNavise();
		
		assertEquals(99.8, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void promeniFrekvencijuNanize() {
		r.trenutnaFrekvencija = 99.3;
		
		r.promeniFrekvencijuNanize();
		
		assertEquals(99.2, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void postaviFrekvenciju() {
		r.trenutnaFrekvencija = 107.9;
		
		r.postaviFrekvenciju(99.1);
		
		assertEquals(99.1, r.trenutnaFrekvencija, 0.0001);
	}
	
	@Test
	public void vratiTrenutnuFrekvenciju() {
		r.trenutnaFrekvencija = 100.0;
		
		assertEquals(100.0, r.vratiTrenutnuFrekvenciju(), 0.0001);
	}
	
	@Test
	public void Ukljuci() {
		r.ukljucen = false;
		
		r.ukljuci();
		
		assertEquals(true, r.ukljucen);
	}
	
	@Test
	public void Iskljuci() {
		r.ukljucen = true;
		
		r.iskljuci();
		
		assertEquals(false, r.ukljucen);
	}
	
	@Test
	public void DaLiJeUkljucen() {
		r.ukljucen = true;
		
		assertEquals(true, r.daLiJeUkljucen());
	}
	
	

}
