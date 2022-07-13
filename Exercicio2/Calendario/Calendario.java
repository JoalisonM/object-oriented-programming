package Exercicio2.Calendario;

public class Calendario {
  private int dia, mes, ano;

  public Calendario(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String nomeMes(int m) {
    switch (m) {
      case 1:
        return "Janeiro";
      case 2:
        return "Fevereiro";
      case 3:
        return "Março";
      case 4:
        return "Abril";
      case 5:
        return "Maio";
      case 6:
        return "Junho";
      case 7:
        return "Julho";
      case 8:
        return "Setembro";
      case 9:
        return "Agosto";
      case 10:
        return "Outubro";
      case 11:
        return "Novembro";
      case 12:
        return "Dezembro";
      default:
        return "Errou";
    }
  }

  public void mostrarData() {
    System.out.println(dia + " de " + nomeMes(mes) + " de " + ano);
  }

  public void anoBissexto() {
    if (ano % 4 == 0) {
      System.out.println("Ano bissexto");
    } else {
      System.out.println("O ano não é bissexto");
    }
  }
}
