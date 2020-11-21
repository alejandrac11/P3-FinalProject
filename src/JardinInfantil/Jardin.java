package JardinInfantil;

import java.util.ArrayList;


	public class Jardin {
	
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		
		String nombre;
		
		public void promEdadEstudiantes() {
			
			int totalEdades = 0;
			
			
			for (Estudiante estudiante : listaEstudiantes) {
				
				totalEdades = totalEdades + estudiante.Edad;
				
			}
			System.out.println("El promedio de edades de los estudiantes del jardín, es: " + totalEdades/listaEstudiantes.size());
		}
	
	
	
	
	
}
