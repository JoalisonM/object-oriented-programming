package Agenda;

public class Main {
  public static void main(String[] args) {
    Agenda contatos = new Agenda(2);

    contatos.addPessoa(new Pessoa("Joalison", 20, "83991353102"));
    contatos.addPessoa(new Pessoa("Pedro", 21, "83991353102"));

    System.out.println(contatos.nomeDaPessoaMaisNova());
  }
}
