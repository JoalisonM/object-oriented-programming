package Vetor;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int num[] = new int[10];
    Scanner input = new Scanner(System.in);

    for (int indice = 0; indice < num.length; indice++) {
      System.out.print("Digite um número: ");
      num[indice] = input.nextInt();
    }

    for (int indice = num.length - 1; indice >= 0; indice--) {
      System.out.println(num[indice]);
    }
  }
}