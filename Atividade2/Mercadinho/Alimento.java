package Atividade2.Mercadinho;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Alimento extends Produto {
  private String classificacao;

  public Alimento(String nome, String codigo, String descricao, double valor, Date dataFabricacao,
      Date dataValidade, String classificacao) {
    super(nome, codigo, descricao, valor, dataFabricacao, dataValidade);
    this.classificacao = classificacao;
  }

  public String getClassificacao() {
    return classificacao;
  }

  public void setClassificacao(String classificacao) {
    this.classificacao = classificacao;
  }

  public String toString() {
    DateFormat brFormato = new SimpleDateFormat("dd/MM/yyyy");

    return "\nCódigo: " + getCodigo() + "\nNome: " + getNome() +
        "\nDescrição: " + getDescricao() + "\nValor: R$" + getValor() +
        "\nClassificação: " + getClassificacao() +
        "\nData de fabricação: " + brFormato.format(getDataFabricacao()) +
        "\nData de validade: " + brFormato.format(getDataValidade());
  }
}
