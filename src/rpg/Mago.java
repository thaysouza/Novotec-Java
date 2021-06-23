package rpg;

public class Mago extends Personagem {
	
    public void usarMagia(String nome, String magia) {
    	System.out.println(nome + " utiliza " + magia);
    }

	public static void main(String[] args) {
		Mago m = new Mago();
		
		m.nome = "Rakhan, o louco";
		m.força = 7;
		m.destreza = 13;
		m.inteligencia = 25;
		
		m.usarMagia(m.nome, "Invisibilidade");
		m.usarMagia(m.nome, "Bola de fogo e incedeia toda a cidade");

	}

}
