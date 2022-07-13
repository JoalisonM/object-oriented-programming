package Estacionamento;

public abstract class Veiculo {
  private int ano;
  private String modelo;

  public Veiculo(int ano, String modelo) {
    this.ano = ano;
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public String getModelo() {
    return modelo;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public abstract void frear();

  public abstract void acelerar();
}
