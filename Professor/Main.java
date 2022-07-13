package Professor;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite os dados do Professor\n");

    System.out.print("Nome: ");
    String nome = input.nextLine();

    System.out.print("Matricula: ");
    String matricula = input.nextLine();

    System.out.print("Nome do departamento: ");
    String nomeDepartamento = input.nextLine();

    Professor barros = new Professor(nome, matricula, nomeDepartamento);

    System.out.println("\nDados do professor " + barros.getNome());
    System.out.println("Matrícula: " + barros.getMatricula());
    System.out.println("Nome do departamento: " + barros.getNomeDepartamento());
  }
}
