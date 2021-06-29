package classe_abstrada;

public class Serie extends Programa{
	int temporada;
	String categoria;

	public static void main(String[] args) {
		
		Serie s = new Serie();
		s.titulo = "One Day at a Time";
		s.temporada = 5;
		s.categoria = "Comédia";

	}

}
