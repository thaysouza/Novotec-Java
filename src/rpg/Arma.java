package rpg;

public class Arma extends Equipamento{

	String tipo;
	int dano;
	int nivel;
	
    public void habilidadeMagica() {
    	System.out.println("Sequência de 3 golpes críticos");
    }
	
	public static void main(String[] args) {
		Arma rebellion = new Arma();
		rebellion.nome = "Rebellion";
		rebellion.dano = 5000;
		rebellion.tipo = "Espada";
		rebellion.nivel = 50;
		
		System.out.println("Nome: " + rebellion.nome);
		System.out.println("Dano: " + rebellion.dano);
		System.out.println("Tipo: " + rebellion.tipo);
		System.out.println("Nivel: " + rebellion.nivel);
		
		rebellion.habilidadeMagica();
		
	}

}
