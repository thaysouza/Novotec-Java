package exercicios;

public class Capital {
	
	String nome;

	public static void main(String[] args) {
		
		Capital cidade1 = new Capital();
		cidade1.nome = "São Paulo";
		
		Capital cidade2 = new Capital();
		cidade2.nome = "Rio de Janeiro";
		
		Capital minas = new Capital();
		minas.nome = "Minas Gerais";
		
		Capital listaCapitais [] = new Capital [3];
		listaCapitais[0] = cidade1; 
		listaCapitais[1] = cidade2; 
		listaCapitais[2] = minas; 
		
		int i = 0;
		
		for(; i <listaCapitais.length; i++) {
			System.out.println(listaCapitais[i].nome);
		}

	}

}
