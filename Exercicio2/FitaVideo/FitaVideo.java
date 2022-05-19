package FitaVideo;

public class FitaVideo {
  private String titulo;
  private double precoPorDia;

  public FitaVideo(String titulo, double precoPorDia) {
    this.titulo = titulo;
    this.precoPorDia = precoPorDia;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public double getPrecoPorDia() {
    return precoPorDia;
  }

  public void setPrecoPorDia(double precoPorDia) {
    this.precoPorDia = precoPorDia;
  }

  public double getValorAluguel(int numeroDeDiasAlugada) {
    double valorAluguel = precoPorDia * numeroDeDiasAlugada;
    return valorAluguel;
  }

  public String toString() {
    return "Título: " + titulo + "\n" + "Preço por dia: " + precoPorDia;
  }
}
