package ArrayList;

import java.util.ArrayList;

public class Carro {
    String marca; 
    int ano;
    
	public Carro(String marca, int ano) {
		this.marca = marca;
		this.ano = ano;
	}

	public static void main(String[] args) {
	  
		Carro c1 = new Carro("ford", 2006);
		Carro c2 = new Carro("Toyota", 2018);
		Carro c3 = new Carro("Honda", 2010);
		
		 ArrayList<Carro> carros = new ArrayList<Carro>();

		 carros.add(c1);
		 carros.add(c2);
		 carros.add(c3);
		  
		  for(Carro car : carros) {
			  System.out.println(car.marca+ " " + car.ano);	  
		  }
	}
}
