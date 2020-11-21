package JardinInfantil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main (String [] args) throws NumberFormatException, IOException {
		
		
		BufferedReader archivo = new BufferedReader(new FileReader("JardinInfantil.txt"));
		String JardinInfantil [] = archivo.readLine().split(",");
		Jardin jardin = new Jardin();
		jardin.nombre = JardinInfantil[0];
		int numEstudiantes = Integer.parseInt(archivo.readLine());
		Vacunacion vacunacion = new Vacunacion();
		
		for (int i = 0; i < numEstudiantes; i++) {
		Estudiante estudiante = new Estudiante();
		String DatosEstudiante [] = archivo.readLine().split(",");
		
		estudiante.Nombre = DatosEstudiante [0];
		estudiante.Edad = Integer.parseInt(DatosEstudiante[1]);
		estudiante.Grupo = DatosEstudiante [2];
		estudiante.vacunas = Integer.parseInt(DatosEstudiante[3]);
		estudiante.prioridad = Integer.parseInt(DatosEstudiante[4]);
		vacunacion.agregarEstudiante(estudiante);
		jardin.listaEstudiantes.add(estudiante);
		}
		
		int totalVacunados = vacunacion.reporteVacunacion();
		System.out.println("El total de vacunas aplicadas en el jardín, es de:" + totalVacunados);
		
		jardin.promEdadEstudiantes();
		vacunacion.estudianteMasVacunado();
		
	}
	
	
	
}
