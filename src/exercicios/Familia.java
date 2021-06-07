package exercicios;


public class Familia {
	String nome;
	int idade;
	String ocupacao;
	double salario;

	public static void main(String[] args) {
		
		Familia Pai = new Familia();
		Pai.nome = "lourival";
		Pai.idade = 54;
		Pai.ocupacao = "eletricista";
		Pai.salario = 1500;
		
		Familia Mae = new Familia();
		Mae.nome = "sonia";
		Mae.idade = 43;
		Mae.ocupacao = "desempregada";
		Mae.salario = 0;
		
		Familia Filha = new Familia();
		Filha.nome = "Thay";
		Filha.idade = 23;
		Filha.ocupacao = "estudante";
		Filha.salario = 0;
		
		double media = (Pai.salario + Mae.salario + Filha.salario) / 3;
		System.out.println("Renda Familiar: " + media);
		

	}

}
