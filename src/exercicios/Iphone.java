package exercicios;

public class Iphone {
	
		private int quantidade;
		private double preço;


		public int getQuantidade() {
		return quantidade;
		}
		
		public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		}
		
		public double getPreço(){
		return preço;
		}
		
		public void setPreço(double preço){
		this.preço = preço;
		}
		
		public double calcular(double quantidade, double preço){
		double total = quantidade * preço;
		return total;
		}

		public static void main(String[] args) {

		Iphone s = new Iphone();
		
		s.setPreço(1200);
		s.setQuantidade(5);
		double total = s.calcular(s.getQuantidade(), s.getPreço());
		System.out.println(total);
		}
		
}
