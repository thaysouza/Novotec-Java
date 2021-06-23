package rpg;

public class Guerreiro extends Personagem{
	
	public void ataqueCorporal(String nome) {
		System.out.println(nome + " ataca com espada");
	}
	
	public void usarEscudo(String nome) {
		System.out.println(nome + " defende com escudo");
	}


	public static void main(String[] args) {
	    Guerreiro g = new Guerreiro();
	    
	    g.nome = "Hagar";
	    g.força = 20;
	    g.destreza = 12;
	    g.inteligencia = 2;
	    g.usarEscudo(g.nome);
	    g.ataqueCorporal(g.nome);

	}

}
