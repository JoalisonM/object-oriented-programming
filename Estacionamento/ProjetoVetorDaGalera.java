package Estacionamento;

public class ProjetoVetorDaGalera {
  public static void main(String[] args) {
    Estacionamento e = new Estacionamento(5);
    e.adicionar(new Carro(2010, 50, "abacate"));
    e.adicionar(new Carro(2010, 50, "abacate"));
    e.adicionar(new Carro(2010, 50, "abacate"));
    e.adicionar(new Carro(2010, 50, "abacate"));
    e.adicionar(new Carro(2010, 50, "abacate"));
    e.adicionar(new Carro(2010, 50, "abacate"));
    e.exibirCarros();
  }
}
