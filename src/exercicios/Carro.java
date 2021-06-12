package exercicios;

public class Carro {
	
	String marca;
	String modelo;
	int ano;
	int velocidade;

	public Carro() {
	   velocidade = 180;
	}

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.ano = 2020;
		c.marca = "Fiat";
		c.modelo = "Fiat Uno";
		System.out.println("Marca: " + c.marca);
		System.out.println("Modelo: " + c.modelo);
		System.out.println("Ano: " + c.ano);
		System.out.println("Velocidade Máxima: " + c.velocidade);
	

	}

}
