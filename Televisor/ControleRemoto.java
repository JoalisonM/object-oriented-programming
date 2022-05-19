public class ControleRemoto {
  private TV tv;

  public ControleRemoto(TV tv) {
    this.tv = tv;
  }

  public TV getTv() {
    return tv;
  }

  public void setTv(TV tv) {
    this.tv = tv;
  }

  public void ligar() {
    tv.ligar();
  }

  public void desligar() {
    tv.desligar();
  }

  public void trocarCanal(int canal) {
    tv.trocarCanal(canal);
  }

  public void aumentarVolume() {
    tv.aumentarVolume();
  }

  public void diminuirVolume() {
    tv.diminuirVolume();
  }

  public void passar1Canal() {
    tv.passar1Canal();
  }

  public void voltar1Canal() {
    tv.voltar1Canal();
  }
}
