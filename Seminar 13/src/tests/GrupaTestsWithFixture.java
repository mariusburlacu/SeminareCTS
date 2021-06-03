package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import categorii.TesteUrgente;
import clase.Grupa;
import clase.Student;

public class GrupaTestsWithFixture {
	Grupa grupa = null;

	@Before
	public void setUp(){
		grupa = new Grupa(1077);
		for(int i=0; i<10; i++) {
			Student student = new Student("Marcel");
			student.adaugaNota(5);
			student.adaugaNota(4);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitate() {
		Student student = new Student("Marcel");
		student.adaugaNota(10);
		student.adaugaNota(10);
		
		Student studentMaria = new Student("Maria");
		studentMaria.adaugaNota(10);
		studentMaria.adaugaNota(10);
		
		grupa.adaugaStudent(studentMaria);
		grupa.adaugaStudent(student);
		
		assertEquals(0.16, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test 
	@Category({TesteGetPromovabilitate.class, TesteUrgente.class})
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0,  grupa.getPromovabilitate(), 0.05);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		int nrGrupa = 1077;
		Grupa grupa = new Grupa(nrGrupa);
	}

}
