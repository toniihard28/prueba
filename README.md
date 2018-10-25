public class Alumno {

	private int id;
	private double nota;
	
	Asignatura baseDeDatos;
	Asignatura marcas;
	Asignatura programacion;
	public Alumno(Asignatura  baseDeDatos, Asignatura marcas, Asignatura programacion) {
		
		this.baseDeDatos =  baseDeDatos;
		this.marcas = marcas;
		this.programacion = programacion;
	}

	
	public Alumno(int baseDeDatos, int marcas, int programacion) {
		
	}

	

	public Asignatura getMarcas() {
		return marcas;
	}

	public Asignatura getProgramacion() {
		return programacion;
	}


	public Asignatura getbaseDeDatos() {
		
		return baseDeDatos;
	}

}
