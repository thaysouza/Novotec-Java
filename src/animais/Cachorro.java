package animais;

public class Cachorro extends Animal{
	
	public void fazerBarulho() {
		System.out.println("Au au!");
	}

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		dog.fazerBarulho();
		
		Animal porco = new Animal();
		porco.fazerBarulho();

	}

}
