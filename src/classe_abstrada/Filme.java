package classe_abstrada;

public class Filme extends Programa{
	   String categoria;
	   
	   
	   public static void main(String[] args) {
		   
		   Filme f = new Filme();
		   
		   f.titulo = "Um amor para recordar";
		   f.ano = 2001;
		   f.categoria = "Romance";
		   
		   System.out.println(f.titulo);
		   System.out.println(f.ano);
		   System.out.println(f.categoria);
		   
	   }



}
