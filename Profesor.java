public class Profesor {

	public Profesor() {
		
	}
	
	public Alumno ponerNotas(Alumno c) {
		double nota;

		nota = Math.random() * 10;
		c.getMarcas().setNota(nota);
		nota = Math.random() * 10;
		c.getbaseDeDatos().setNota(nota);
		nota = Math.random() * 10;
		c.getProgramacion().setNota(nota);
		
		return c;
	}

	public double calcularMedias(Alumno c) {
		double media;

		media = ((c.getbaseDeDatos().getNota()) + (c.getMarcas().getNota()) + (c.getProgramacion().getNota())) / 3;
		
		return media;
	}
}
