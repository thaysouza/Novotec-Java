package exercicios;

public class Vacinados {
	
	private double qtdPessoasVacinadas;
	private double populacaoTotal;
	
	
	public double getQtdPessoasVacinadas() {
		return qtdPessoasVacinadas;
	}
	
	public void setQtdPessoasVacinadas(double qtdPessoasVacinadas) {
		this.qtdPessoasVacinadas = qtdPessoasVacinadas;
	}
	
	
	
	public double getPopulacaoTotal() {
		return populacaoTotal;
	}
	
	public void setPopulacaoTotal(double populacaoTotal) {
		this.populacaoTotal = populacaoTotal;
	}
	
	
	public double calcularVacinados(double qtdPessoasVacinadas, double populacaoTotal) {
		double porcentagemVacinados = (( qtdPessoasVacinadas * 100 ) / populacaoTotal) ;
		return porcentagemVacinados;
	}
	

	public static void main(String[] args) {
		
		Vacinados vacinados = new Vacinados();
		
		
		vacinados.setPopulacaoTotal(214.4);
		vacinados.setQtdPessoasVacinadas(74.5);
		
		
		double valor = vacinados.calcularVacinados(vacinados.getQtdPessoasVacinadas(), vacinados.getPopulacaoTotal());
		System.out.printf("No Brasil foram vacinados %.2f %% da população", valor);
		
	}

}
