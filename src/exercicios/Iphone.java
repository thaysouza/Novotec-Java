package exercicios;

public class Iphone {
	
		private int quantidade;
		private double pre�o;


		public int getQuantidade() {
		return quantidade;
		}
		
		public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		}
		
		public double getPre�o(){
		return pre�o;
		}
		
		public void setPre�o(double pre�o){
		this.pre�o = pre�o;
		}
		
		public double calcular(double quantidade, double pre�o){
		double total = quantidade * pre�o;
		return total;
		}

		public static void main(String[] args) {

		Iphone s = new Iphone();
		
		s.setPre�o(1200);
		s.setQuantidade(5);
		double total = s.calcular(s.getQuantidade(), s.getPre�o());
		System.out.println(total);
		}
		
}
