package escola;

public class Diretora extends Funcionarios {

	public static void main(String[] args) {
		
		
		Diretora d = new Diretora(); 
		
        d.setNome("Rosana");
        d.setSalario(5000.00d);
        
        System.out.println("A diretora " + d.getNome() + " recebe um salario de " + d.getSalario());
        

	}

}
