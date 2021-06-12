package exercicios;

public class Vacinados {
	
	private double qtdPessoasVacinadas;
	final private double populacaoTotal = 214000000 ;
	
	
	public double getQtdPessoasVacinadas() {
		return qtdPessoasVacinadas;
	}
	
	public void setQtdPessoasVacinadas(double qtdPessoasVacinadas) {
		this.qtdPessoasVacinadas = qtdPessoasVacinadas;
	}
	
	
	
	public double getPopulacaoTotal() {
		return populacaoTotal;
	}
	

	
	public double calcularVacinados(double qtdPessoasVacinadas, double populacaoTotal) {
		double porcentagemVacinados =(( qtdPessoasVacinadas * 100 ) / populacaoTotal) ;
		return porcentagemVacinados;
	}
	
	
	public double faltaVacinar(double qtdPessoasVacinadas, double populacaoTotal) {
		double porcentagemFaltaVacinar = populacaoTotal - qtdPessoasVacinadas ;
		return porcentagemFaltaVacinar;
	}

	public static void main(String[] args) {
		
		Vacinados vacinados = new Vacinados();
		
	
		vacinados.setQtdPessoasVacinadas(50000000);
		
		
		double valor = vacinados.calcularVacinados(vacinados.getQtdPessoasVacinadas(), vacinados.getPopulacaoTotal());
		System.out.printf("No Brasil foram vacinados %.2f %% da população", valor);
		
		double valorFalta = vacinados.faltaVacinar(vacinados.getQtdPessoasVacinadas(), vacinados.getPopulacaoTotal());
		System.out.printf("\nNo Brasil faltam vacinar %.0f pessoas", valorFalta);
		
	}

}
