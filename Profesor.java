Public class Profesor {
	
	public double ponerNotas(Alumno c) {
		Asignatura nota1,nota2,nota3;
		double nota;
		
		nota=Math.random()*10;
		c.getMarcas().setNota(nota);
		nota=Math.random()*10;
		c.getbaseDeDatos().setNota(nota);
		nota=Math.random()*10;
		c.getProgramacion().setNota(nota);
	return nota;	
	}
public double calcularMedias(Alumno c) {
	double media;
	media=((c.getbaseDeDatos().getNota())+(c.getMarcas().getNota())+(c.getProgramacion().getNota()))/3;
	return media;
}
}
