package zadatak1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelevizorTest {
	
	Televizor t;

	@Before
	public void setUp() throws Exception {
		t = new Televizor();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void atribut_jacinaTona() {
		assertEquals("Početna jačina tona bi trebalo da bude 0, ali je "+t.jacinaTona, 0, t.jacinaTona);
	}
	
	@Test
	public void atribut_ukljucen() {
		assertEquals("Početna vrednost atributa ukljucen bi trebalo da bude false, ali je "+t.ukljucen, false, t.ukljucen);
	}
	
	@Test
	public void atribut_program() {
		assertEquals("Početna vrednost atributa program bi trebalo da bude 1, ali je "+t.program,1, t.program);
	}
	
	@Test
	public void metoda_pojacajTon() {
		t.jacinaTona = 5;
		
		t.pojacajTon();
		
		assertEquals("Kad je jacina tona 5 i pozove se metoda, jacina tona ne postane 6, već "+t.jacinaTona, 6, t.jacinaTona);
	}
	
	@Test
	public void metoda_smanjiTon() {
		t.jacinaTona = 4;
		
		t.smanjiTon();
		
		assertEquals("Kad je jacina tona 4 i pozove se metoda, jacina tona ne postane 3, već "+t.jacinaTona,3, t.jacinaTona);
	}
	
	@Test
	public void metoda_iskljuciTon() {
		t.jacinaTona = 5;
		
		t.iskljuciTon();
		
		assertEquals("Kad je jacina tona 5 i pozove se metoda, jacina tona ne postane 0, već "+t.jacinaTona, 0, t.jacinaTona);
	}
	
	@Test
	public void metoda_ukljuci() {
		t.ukljucen = false;
		
		t.ukljuci();
		
		assertEquals("Kad je ukljucen false i pozove se metoda, ukljucen ne postane true, već "+t.ukljucen, true, t.ukljucen);
	}
	
	@Test
	public void metoda_iskljuci() {
		t.ukljucen = true;
		
		t.iskljuci();
		
		assertEquals("Kad je ukljucen true i pozove se metoda, ukljucen ne postane false, već "+t.ukljucen, false, t.ukljucen);
	}
	
	@Test
	public void metoda_daLiJeUkljucen() {
		t.ukljucen = true;
		
		assertEquals("Kad je ukljucen true i pozove se metoda, ona ne vraća true, već "+t.ukljucen, true, t.daLiJeUkljucen());
	}
	
	@Test
	public void metoda_vratiJacinuTona() {
		t.jacinaTona = 12;
		
		assertEquals("Kad je jacinaTona 12 i pozove se metoda, ona ne vraća 12, već "+t.vratiJacinuTona(), 12, t.vratiJacinuTona());
	}
	
	@Test
	public void metoda_promeniProgram() {
		t.promeniProgram(15);
		
		assertEquals("Kad se pozove metoda da podesi program na 15, ona ga podesi na "+t.jacinaTona, 15, t.program);
	}

}
