
public class Principal {

	public static void main(String[] args) {
		// Se declaran las variables
		Asignatura baseDeDatos, marcas, programacion;
		Profesor profesor;
		Alumno alumno;
		
		// Se inicializan las variables
		baseDeDatos = new Asignatura(1);
		marcas = new Asignatura(2);
		programacion = new Asignatura(3);
		alumno = new Alumno(baseDeDatos, marcas, programacion);
		profesor = new Profesor();
		
		alumno = profesor.ponerNotas(alumno);  // Se establecen notas a las asignaturas del alumno
		
		alumno.setNota(profesor.calcularMedias(alumno));  // Se establece la nota media del alumno calculada por el profesor
		
		System.out.println("La media es: " + alumno.getNota());  // Se muestra la nota media del alumno
		
		
		/* 
		 Desarrollar un programa que en su método main:
			· Cree e inicialice 3 asignaturas.
			· Cree 1 alumno con las 3 asignaturas.
			· Cree un profesor que le ponga calificaciones al alumno.
			· Mostrar por pantalla la media del alumno.
		 */
	}

}
