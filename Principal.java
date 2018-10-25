
public class Principal {

	public static void main(String[] args) {
		int id,num1,id2,id3,num2,num3;
		id=1;
		id2=2;
		id3=3;
		double media,nota;
		
		Asignatura baseDeDatos,marcas,programacion;
		
		marcas = new Asignatura(id);
		baseDeDatos = new Asignatura(id2);
		programacion = new Asignatura(id3);
		
		Alumno c = new Alumno(baseDeDatos,marcas,programacion);
		
		Profesor p1 = new Profesor();
		media=p1.calcularMedias(c);
		System.out.println("La media es : " +media  );
		
		
		/* 
		 Desarrollar un programa que en su método main:
· Cree e inicialice 3 asignaturas.
· Cree 1 alumno con las 3 asignaturas.
· Cree un profesor que le ponga calificaciones al alumno.
· Mostrar por pantalla la media del alumno.
		 */
	}

}
