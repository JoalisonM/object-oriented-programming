package Atividade2.Adega;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VinhoTinto extends Vinho {
  private Date safra;

  public VinhoTinto(String nome, String tipoUva, String fabricante, double valor, Date dataFabricacao, Date safra) {
    super(nome, tipoUva, fabricante, valor, dataFabricacao);
    this.safra = safra;
  }

  public Date getSafra() {
    return safra;
  }

  public void setSafra(Date safra) {
    this.safra = safra;
  }

  public String toString() {
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");

    return "\nNome: " + getNome() +
        "\nTipo de uva: " + getTipoUva() +
        "\nFabricante : " + getFabricante() +
        "\nValor: " + getValor() +
        "\nData de fabricação: " + brFormat.format(getDataFabricacao()) +
        "\nSafra: " + brFormat.format(getSafra());
  }
}
