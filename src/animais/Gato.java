package animais;

public class Gato extends Animal{
	
	public void fazerBarulho() {
		System.out.println("Miau miau!");
	}

	public static void main(String[] args) {
		
		Gato cat = new Gato();
		cat.fazerBarulho();
		
		

	}

}
