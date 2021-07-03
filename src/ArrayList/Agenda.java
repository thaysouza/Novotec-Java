package ArrayList;

import java.util.ArrayList;

public class Agenda {
  String nome;
  String telefone;
  String email;
  
  
  public Agenda(String nome, String telefone, String email) {
	this.nome = nome;
	this.telefone = telefone;
	this.email = email;
  }
  
  public static void main(String[] args) {
	  
	  Agenda a = new Agenda("thay", "955556666", "teste@gmail.com");
	  
	  ArrayList<Agenda> agenda = new ArrayList<Agenda>();
	  agenda.add(a);
	  
	  for(Agenda ag : agenda) {
		  System.out.println(ag.nome + "\n" + ag.email + "\n" + ag.telefone);
		  
	  }
  }
  
}


