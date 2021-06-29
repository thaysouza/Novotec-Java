package escola;

public class Funcionarios {
	
	protected String nome;
	protected double salario;
	protected double bonus;

	public double calcularSalario(){
		return salario;
	}
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}





}
