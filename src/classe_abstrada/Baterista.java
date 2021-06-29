package classe_abstrada;

public class Baterista extends Musico{
	
	@Override
	public void tocarInstrumento() {
		System.out.println("Tocar Bateria");
	}
	

	public String toString() {
		return "Baterista nome = " + nome + ", idade = " + idade + ", EstiloMusical = " + EstiloMusical;
	}
	
    public static void main(String[] args) {
		
		Baterista b = new Baterista();
		b.nome ="Lori Peters";
		b.idade = 47;
		b.EstiloMusical ="rock alternativo";
		
		System.out.println(b.toString());
	}


}
