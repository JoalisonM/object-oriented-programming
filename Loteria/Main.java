package Loteria;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a quantidade de apostas: ");
    int quantidadeApostas = teclado.nextInt();
    Loteria sorteGrande = new Loteria(quantidadeApostas);

    for (int i = 0; i < quantidadeApostas; i++) {
      System.out.println("Digite a quantidade de números da " + (i + 1) + "ª aposta");
      int tamanho = teclado.nextInt();
      int aposta[] = new int[tamanho];

      for (int j = 0; j < aposta.length; j++) {
        System.out.println("Digite o " + (i + 1) + "ª número: ");
        aposta[j] = teclado.nextInt();
      }

      sorteGrande.adicionarAposta(aposta);
    }

    sorteGrande.imprimirAposta();
  }
}
