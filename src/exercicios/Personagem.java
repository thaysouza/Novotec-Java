package exercicios;

public class Personagem {
	
		String nome;
		String cor;
		int qtdVidas;
		
		
		public Personagem(){
			qtdVidas = 5;
		}
		
	public static void main(String[] args) {
		
		Personagem mario = new Personagem();		
		mario.nome = "Mario";
		mario.cor = "Vermelho";
		
		Personagem luigi = new Personagem();	
		luigi.nome = "Luigi";
		luigi.cor = "Verde";
		
		System.out.println("Nome: " + mario.nome + "\nCor: " + mario.cor + "\nVidas: " + mario.qtdVidas);
		System.out.println("\nNome: " + luigi.nome + "\nCor: " + luigi.cor + "\nVidas: " + luigi.qtdVidas);
	}

}
