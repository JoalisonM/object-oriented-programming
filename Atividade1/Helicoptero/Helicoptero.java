package Helicoptero;

public class Helicoptero {
  private double altitude;
  private boolean estaLigado;
  private int capacidade, quantidadePessoasPresente;

  public Helicoptero(int capacidade) {
    this.altitude = 0;
    this.estaLigado = false;
    this.capacidade = capacidade;
    this.quantidadePessoasPresente = 0;
  }

  public double getAltitude() {
    return altitude;
  }

  public void setAltitude(double altitude) {
    this.altitude = altitude;
  }

  public boolean getEstaLigado() {
    return estaLigado;
  }

  public void setEstaLigado(boolean estaLigado) {
    this.estaLigado = estaLigado;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public int getQuantidadePessoasPresente() {
    return quantidadePessoasPresente;
  }

  public void setQuantidadePessoasPresente(int quantidadePessoasPresente) {
    this.quantidadePessoasPresente = quantidadePessoasPresente;
  }

  public void entrar() {
    if (quantidadePessoasPresente < capacidade) {
      setQuantidadePessoasPresente(getQuantidadePessoasPresente() + 1);
    }
  }

  public void sair() {
    if (quantidadePessoasPresente > 0) {
      setQuantidadePessoasPresente(getQuantidadePessoasPresente() - 1);
    } else {
      System.out.println("Não tem ninguém dentro do helicóptero\n");
    }
  }

  public void ligar() {
    if (!estaLigado) {
      setEstaLigado(true);
    }
  }

  public void desligar() {
    if (estaLigado) {
      setEstaLigado(false);
    }
  }

  public void decolar(double altitudeInformada) {
    if (estaLigado && altitude == 0) {
      setAltitude(altitudeInformada);
    } else {
      System.out.println("Não decolou, o helicóptero deve está ligado e na altitude 0\n");
    }
  }

  public void aterrissar() {
    if (estaLigado && altitude > 0) {
      setAltitude(0);
    } else {
      System.out.println("Não aterrissou, o helicóptero deve está ligado e em uma altitude maior que 0\n");
    }
  }

  @Override
  public String toString() {
    String ligado = estaLigado ? "Sim" : "Não";
    return "Está ligado: " + ligado + "\n" + "Capacidade: " + capacidade + "\n" + "Quantidade de pessoas: "
        + quantidadePessoasPresente + "\n" + "Altitude: " + altitude + "\n";
  }
}