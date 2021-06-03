package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.IStudent;
import tests.dubluri.StudentFake;
import tests.dubluri.StudentStub;

public class GrupaTestWithFake {

	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testPromovabilitateAreRestante() {
		Grupa grupa = new Grupa(1077);
		for(int i=0;i<8;i++) {
			StudentFake student = new StudentFake();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		StudentFake student1 = new StudentFake();
		student1.setAreRestante(true);
		StudentFake student2 = new StudentFake();
		student2.setAreRestante(true);
		
		grupa.adaugaStudent(student1);
		grupa.adaugaStudent(student2);
		
		assertEquals(0.8, grupa.getPromovabilitate(), 0.01);
	}

}
