package animais;

public class Animal {
      private String nome;
       
       public void fazerBarulho() {
    	   System.out.println("Fazer barulho!");
       }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
       
  public static void main(String[] args) {
	  Animal vaca = new Animal();
	  vaca.fazerBarulho();
  }
}
