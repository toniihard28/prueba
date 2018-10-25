
public class Principal {

	public static void main(String[] args) {
		System.out.println("INICIO");
		double media;
		
		Asignatura baseDeDatos, marcas, programacion;
		
		baseDeDatos = new Asignatura(1);
		marcas = new Asignatura(2);
		programacion = new Asignatura(3);
		
		Alumno c = new Alumno(baseDeDatos, marcas, programacion);
		
		Profesor p1 = new Profesor();
		media = p1.calcularMedias(c);
		System.out.println("La media es : " + media);
		
		
		/* 
		 Desarrollar un programa que en su método main:
			· Cree e inicialice 3 asignaturas.
			· Cree 1 alumno con las 3 asignaturas.
			· Cree un profesor que le ponga calificaciones al alumno.
			· Mostrar por pantalla la media del alumno.
		 */
	}

}
