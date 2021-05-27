package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {
	Student student = null;
	
	@Before
	public void setUp() {
		student = new Student();
	}

	@Test
	public void testApelConstructorCuParametru() {
		String nume = "George";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume = "Student";
		Student student = new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testSetareNume() {
		Student student = new Student();
		student.setNume("George");
		assertEquals("George", student.getNume());
	}

	@Test
	public void testApelInitializareLista() {
		Student student = new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
		//Student student = new Student();
		int nota = 5;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testVerificaMarimeLista() {
		//Student student = new Student();
		int nota = 2;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculMedie() {
		student.adaugaNota(2);
		student.adaugaNota(9);
		assertEquals(5.5, student.calculeazaMedie(), 0);
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0);
	}
	
	@Test
	public void testCalculMedieCuOSinguraNota() {
		student.adaugaNota(6);
		assertEquals(6, student.calculeazaMedie(), 0);
	}
	
	@Test
	public void testAreRestante() {
		student.adaugaNota(4);
		student.adaugaNota(10);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		student.adaugaNota(6);
		student.adaugaNota(5);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificareAruncareExceptieIndex() {
		student.getNota(-1);
	}
}
