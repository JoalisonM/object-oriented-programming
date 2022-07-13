package Televisor;

public class TV {
  private int canal, volume;
  private boolean ligado;

  public TV() {
    this.canal = 1;
    this.volume = 0;
    this.ligado = false;
  }

  public int getCanal() {
    return canal;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean getLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public void ligar() {
    setLigado(true);
  }

  public void desligar() {
    setLigado(false);
  }

  public void aumentarVolume() {
    if (ligado) {
      if (volume <= 100) {
        setVolume(volume + 1);
      } else {
        System.out.println("A TV está no volume máximo");
      }
    } else {
      System.out.println("A TV tá desligada");
    }
  }

  public void diminuirVolume() {
    if (ligado) {
      if (volume > 0) {
        setVolume(volume - 1);
      } else {
        System.out.println("Tá querendo diminuir o volume mais do que o valor dele");
      }
    } else {
      System.out.println("A TV tá desligada");
    }
  }

  public void trocarCanal(int trocarCanal) {
    if (ligado) {
      if (trocarCanal > 0) {
        setCanal(trocarCanal);
      } else {
        System.out.println("Canal não existe");
      }
    } else {
      System.out.println("A TV tá desligada");
    }
  }

  public void passar1Canal() {
    if (ligado) {
      setCanal(canal + 1);
    } else {
      System.out.println("A TV tá desligada");
    }
  }

  public void voltar1Canal() {
    if (ligado) {
      setCanal(canal - 1);
    } else {
      System.out.println("A TV tá desligada");
    }
  }

  public String toString() {
    String estaLigado = ligado ? "sim" : "não";
    return "Ligado: " + estaLigado + ", canal: " + canal + ", volume: " + volume;
  }
}