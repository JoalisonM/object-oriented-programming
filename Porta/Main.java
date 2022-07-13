package Porta;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("cor: ");
    String cor = input.nextLine();
    System.out.print("altura: ");
    double altura = input.nextDouble();
    System.out.print("largura: ");
    double largura = input.nextDouble();
    System.out.print("está aberta: ");
    boolean estaAberta = input.nextBoolean();

    Porta portaPauBrasil = new Porta(cor, altura, largura, estaAberta);

    System.out.println(portaPauBrasil.toString());
  }
}
