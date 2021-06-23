package rpg;

public class Armadura extends Equipamento{

     String tipo;
     int defesa;
     int nivel;
     
     
     public void habilidadeMagica() {
    	 System.out.println("Proteção contra fogo");
     }
     
     public static void main(String[] args) {
    	 Armadura dragonPlate = new Armadura();
    	 dragonPlate.nome = "Armadura de placas de Dragão";
    	 dragonPlate.tipo = "Armadura de Placas";
    	 dragonPlate.nivel = 20;
    	 dragonPlate.defesa = 500;
    	 
    	 System.out.println("Nome: " + dragonPlate.nome);
    	 System.out.println("Tipo: " + dragonPlate.tipo);
    	 System.out.println("Nivel: " + dragonPlate.nivel);
    	 System.out.println("Defesa: " + dragonPlate.defesa);
    	 
    	 dragonPlate.habilidadeMagica();
     }
}
