package exercicios;
 
public class Princesas {

String nome;

public static void main(String[] args) {
	
	Princesas cinderela = new Princesas();
	cinderela.nome = "Cinderela";
	
	Princesas rapunzel = new Princesas();
	rapunzel.nome = "rapunzel";
	
	Princesas elsa = new Princesas();
	elsa.nome = "elsa";
	
	Princesas lista[] = {cinderela, rapunzel,elsa};
	
	for  (int i = 0; i < lista.length; i++) {
		System.out.println("Princesas " + lista[i].nome);
	}
	
}

}
