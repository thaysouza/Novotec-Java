package classe_abstrada;

public class Guitarrista extends Musico{
    
	@Override
	public void tocarInstrumento() {
		System.out.println("Fazer solo de guitarra");
		
	}
	
	public static void main(String[] args) {
		
		Guitarrista g = new Guitarrista();
		g.nome = "Tony Iommi";
		g.idade = 73;
		g.EstiloMusical = "Heavy metal";
		
		System.out.println(g.nome);
		System.out.println(g.idade);
		System.out.println(g.EstiloMusical);
		g.tocarInstrumento();
		

	}

}
