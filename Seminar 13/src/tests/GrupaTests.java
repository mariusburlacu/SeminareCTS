package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class GrupaTests {

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMic() {
		int nrGrupa = 999;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa = 1299;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		int nrGrupa = 1077;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test
	public void testExistenceListaStudenti() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
}
