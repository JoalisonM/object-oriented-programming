package Funcionario;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Funcionario jooj = new Funcionario("Jooj", "111111111111", "1", 1212.00, 20,
        new String[] { "Rua edite Pereira da Silva", "420", "Centro", "583400", "Sapé" });

    System.out.println(jooj.toString());

    Scanner input = new Scanner(System.in);
    System.out.print("Novo sálario: ");
    double salario = input.nextDouble();

    jooj.setSalario(salario);
    System.out.println(jooj.toString());

  }
}
