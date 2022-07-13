package Estacionamento;

public class Carro extends Veiculo {
  private int velocidade;

  public Carro(int ano, int velocidade, String modelo) {
    super(ano, modelo);
    this.velocidade = velocidade;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
  }

  public void frear() {
  };

  public void acelerar() {
  };
}
