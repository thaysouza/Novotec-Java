package exercicios;

public class ObraArte {
	
	String nome;
	String autor;
	int ano;

	public static void main(String[] args) {
		
		ObraArte quadro = new ObraArte();
		quadro.nome = "Noite Estrelada";
		quadro.autor = "Van Gogh";
		quadro.ano = 1889;
		
		ObraArte obra = new ObraArte();
		obra.nome = "Juizo Final";
		obra.autor = "Michelangelo";
		obra.ano = 1541;
		
		
		ObraArte listaObras [] = {quadro,obra};
		
		for (int i = 0; i < listaObras.length; i++) {
			System.out.println("Nome: " + listaObras[i].nome + 
					"\nAutor: " + listaObras[i].autor +
					 "\nAno " + listaObras[i].ano);
		}
		
		

	}

}
