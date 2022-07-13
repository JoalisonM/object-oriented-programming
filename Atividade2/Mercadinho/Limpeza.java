package Atividade2.Mercadinho;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Limpeza extends Produto {
  private boolean ehNocivo;

  public Limpeza(String nome, String codigo, String descricao, double valor, Date dataFabricacao,
      Date dataValidade, boolean ehNocivo) {
    super(nome, codigo, descricao, valor, dataFabricacao, dataValidade);
    this.ehNocivo = ehNocivo;
  }

  public boolean getEhNocivo() {
    return ehNocivo;
  }

  public void setEhNocivo(boolean ehNocivo) {
    this.ehNocivo = ehNocivo;
  }

  public String toString() {
    DateFormat brFormato = new SimpleDateFormat("dd/MM/yyyy");

    return "\nCódigo: " + getCodigo() + "\nNome: " + getNome() +
        "\nDescrição: " + getDescricao() + "\nValor: R$" + getValor() +
        "\nÉ nocivo: " + getEhNocivo() +
        "\nData de fabricação: " + brFormato.format(getDataFabricacao()) +
        "\nData de validade: " + brFormato.format(getDataValidade());
  }
}
