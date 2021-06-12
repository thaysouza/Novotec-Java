package exercicios;

public class Humano {
	String nome;
	int idade;
	String profissão;

	public Humano(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.profissão = "programador";
	}

	public static void main(String[] args) {

		 Humano h = new Humano("Thay", 23);
		 
		 System.out.println("Nome: " + h.nome);
		 System.out.println("Idade: " + h.idade);	 
		 System.out.println("Profissão: " + h.profissão);	

		 Humano m = new Humano("Tamires", 17);
		 System.out.println("\nNome: " + m.nome);
		 System.out.println("Idade: " + m.idade);
		 m.profissão = "estudante";
		 System.out.println("Profissão: " + m.profissão);
	}

}
