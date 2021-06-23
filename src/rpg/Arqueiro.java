package rpg;

public class Arqueiro extends Personagem{

	public void ataqueArco(String nome) {
		System.out.println(nome + " realiza um ataque certeiro com Arco e Flecha");
	}

	public static void main(String[] args) {
		Arqueiro a = new Arqueiro();
		a.nome = "Légolas";
		a.destreza = 19;
		a.força = 10;
		a.inteligencia = 12;
		
		a.ataqueArco(a.nome);
		

	}

}
