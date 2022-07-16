package Adega;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VinhoBranco extends Vinho {
  private String tipo;

  public VinhoBranco(String nome, String tipoUva, String fabricante, double valor, Date dataFabricacao, String tipo) {
    super(nome, tipoUva, fabricante, valor, dataFabricacao);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String toString() {
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");

    return "\nNome: " + getNome() +
        "\nTipo de uva: " + getTipoUva() +
        "\nFabricante : " + getFabricante() +
        "\nValor: " + getValor() +
        "\nData de fabricação: " + brFormat.format(getDataFabricacao()) +
        "\nTipo: " + getTipo();
  }
}
