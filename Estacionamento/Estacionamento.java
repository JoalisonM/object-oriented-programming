package Estacionamento;

public class Estacionamento {
  private Carro[] carros;
  private int indice = 0;

  public Estacionamento(int capacidade) {
    carros = new Carro[capacidade];
  }

  public void adicionar(Carro c) {
    if (indice < carros.length) {
      carros[indice] = c;
      indice++;
    } else {
      System.out.println("Estacionamento está cheio!");
    }

  }

  public void exibirCarros() {
    for (int i = 0; i < carros.length; i++) {
      System.out.printf("O %dº carro é: %s \n", (i + 1), carros[i].getModelo());
    }
  }
}
