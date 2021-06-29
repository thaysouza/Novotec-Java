package classe_abstrada;

public class Desenho extends Programa{
     String dubladores;
     
	public static void main(String[] args) {
		 Desenho d = new Desenho();
		 d.titulo = "Hora de Aventura";
		 d.sinopse = "Com 12 anos de idade, Finn combate o mal na terra"
		 		+ " de Ooo na companhia de seu cachorro mágico, Jake. Quando"
		 		+ " estes dois grandes amigos se juntam e dizem as palavras mágicas"
		 		+ " Hora de Aventura, tudo pode acontecer.";
		 d.ano = 2010;
		 d.dubladores = "Jeremy Shada, John DiMaggio, Olivia Olson...";

	}

}
