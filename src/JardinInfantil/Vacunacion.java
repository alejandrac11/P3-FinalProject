package JardinInfantil;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;

	public class Vacunacion {

		PriorityQueue<Estudiante> colaEstudiantes = new PriorityQueue<Estudiante>();
	
	public void agregarEstudiante(Estudiante estudiante) {
		
		colaEstudiantes.add(estudiante);
	}
	
	public int reporteVacunacion() {
		int totalVacunasAplicadas = 0;
		
		for (Estudiante estudiante : colaEstudiantes) {
			System.out.println("Estudiante Vacunado: " + estudiante.Nombre + "\n Numero de Vacunas Aplicadas: " + estudiante.vacunas);
		totalVacunasAplicadas = totalVacunasAplicadas + estudiante.vacunas;
		
		}
		return totalVacunasAplicadas;
		
	}
	
	public void estudianteMasVacunado() {
		Hashtable<Estudiante, Integer> HashEstudiante = new Hashtable<Estudiante, Integer>();
		for (Estudiante estudiante : colaEstudiantes) {
			int cont = 1;
			if (HashEstudiante.containsKey(estudiante)) {
				cont = HashEstudiante.get(estudiante);
				cont ++;
			}
			HashEstudiante.put(estudiante, cont);
		}
		int estMasVacunas = 0;
		Estudiante masVacunado = null;
		
		Enumeration<Estudiante> enumeration = HashEstudiante.keys();
		while (enumeration.hasMoreElements()) {
			Estudiante key = enumeration.nextElement();
			if (HashEstudiante.get(key) > estMasVacunas) {
				estMasVacunas = HashEstudiante.get(key);
				masVacunado = key;	
			}
			
		}
		System.out.println("El estudiante más vacunado, es: " + masVacunado.Nombre); 
	}	
}
