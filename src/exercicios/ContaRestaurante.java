package exercicios;

public class ContaRestaurante {
	
	private double valorTotal;
	private int qtdPessoas;
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	public double getQtdPessoas() {
		return qtdPessoas;
	}
	
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	public double calcular(double valorTotal, double qtd) {
		double total = valorTotal / qtd;
		return total;
	}

	public static void main(String[] args) {
		
		ContaRestaurante conta = new ContaRestaurante();
		
		conta.setValorTotal(100);
		conta.setQtdPessoas(5);
		
		double valor = conta.calcular(conta.getValorTotal(), conta.getQtdPessoas());
		System.out.println(valor);

	}

}
