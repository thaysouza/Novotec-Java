package exercicios;

public class Humano {
	String nome;
	int idade;
	String profiss�o;

	public Humano(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.profiss�o = "programador";
	}

	public static void main(String[] args) {

		 Humano h = new Humano("Thay", 23);
		 
		 System.out.println("Nome: " + h.nome);
		 System.out.println("Idade: " + h.idade);	 
		 System.out.println("Profiss�o: " + h.profiss�o);	

		 Humano m = new Humano("Tamires", 17);
		 System.out.println("\nNome: " + m.nome);
		 System.out.println("Idade: " + m.idade);
		 m.profiss�o = "estudante";
		 System.out.println("Profiss�o: " + m.profiss�o);
	}

}
