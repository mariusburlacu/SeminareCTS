package ro.ase.cts.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Student;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

public class Program {
	
	public static List<Aplicant> readAplicant(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata angajat: " + Angajat.getSumaFinantata());
		System.out.println("Suma finantata student: " + Student.getSumaFinantata());
		System.out.println("Suma finantata elev: " + Elev.getSumaFinantata());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = readAplicant(new StudentReader("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afiseazaSumaFinantata();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
