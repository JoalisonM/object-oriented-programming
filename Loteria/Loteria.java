package Loteria;

public class Loteria {
  private int indice;
  private int apostas[][];

  public Loteria(int quantidadeApostas) {
    this.indice = 0;
    this.apostas = new int[quantidadeApostas][];
  }

  public void adicionarAposta(int[] aposta) {
    if (indice < apostas.length) {
      apostas[indice] = aposta;
      indice++;
    }
  }

  public void imprimirAposta() {
    for (int linha = 0; linha < indice; linha++) {
      System.out.println((linha + 1) + "ª aposta");
      for (int coluna = 0; coluna < apostas[linha].length; coluna++) {
        System.out.print(apostas[linha][coluna] + " ");
      }
      System.out.println();
    }
  }

}
