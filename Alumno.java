public class Alumno {

	private double nota;
	
	private Asignatura baseDeDatos;
	private Asignatura marcas;
	private Asignatura programacion;

	public Alumno(Asignatura baseDeDatos, Asignatura marcas, Asignatura programacion) {
		this.baseDeDatos =  baseDeDatos;
		this.marcas = marcas;
		this.programacion = programacion;
	}

	public Asignatura getMarcas() {
		return this.marcas;
	}

	public Asignatura getProgramacion() {
		return this.programacion;
	}

	public Asignatura getbaseDeDatos() {
		return this.baseDeDatos;
	}

}
