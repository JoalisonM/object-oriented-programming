package Atividade1.GuerreirosPOO;

import java.util.Scanner;
import java.text.ParseException;

public class Main {
  private static Guerreiro cadastrarGuerreiro() throws ParseException {
    Scanner input = new Scanner(System.in);

    System.out.print("Código do guerreiro: ");
    String codigo = input.nextLine();

    System.out.print("Nome do guerreiro: ");
    String nome = input.nextLine();

    System.out.println("Cadastrado!\n");

    Guerreiro guerreiro = new Guerreiro(codigo, nome);

    return guerreiro;
  }

  public static void main(String[] args) throws ParseException {

    Guerreiro guerreiro1 = cadastrarGuerreiro();
    Guerreiro guerreiro2 = cadastrarGuerreiro();

    System.out.println("\n-+-+-+ Luta com laço -+-+-+");
    // guerreiro1.lutarComLaco(guerreiro2);

    System.out.println("\n-+-+-+ Luta recursiva -+-+-+");
    System.out.println(guerreiro1.lutarRecursivo(guerreiro2));

    System.out.println("\n-+-+-+ Alimentar um guerreiro -+-+-+");
    guerreiro1.alimentarSe();

    System.out.println("\n-+-+-+ Exibir informações de um guerreiro -+-+-+");
    System.out.println(guerreiro1.toString());
  }
}
