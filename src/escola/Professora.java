package escola;

public class Professora extends Funcionarios {
	
	String materia;

	public static void main(String[] args) {
		
		
		Professora p = new Professora(); 
		
        p.materia = "geografia";
        p.setNome("Elena");
        p.setSalario(2800.00d);
        
        System.out.println("A professora " + p.getNome() + " passa a materia de " + p.materia);
        
        
	}

}
