package JardinInfantil;



public class Estudiante implements Comparable<Estudiante> {

	String Nombre;
	String Grupo;
	int Edad;
	int vacunas;
	int prioridad;
	
	public int compareTo(Estudiante estudiante) {
		
		return estudiante.prioridad - this.prioridad;
	}
	
	
	
}
