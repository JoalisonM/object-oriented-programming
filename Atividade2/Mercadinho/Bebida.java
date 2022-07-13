package Atividade2.Mercadinho;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Bebida extends Produto {
  private int graduacaoAlcoolica;

  public Bebida(String nome, String codigo, String descricao, double valor, Date dataFabricacao,
      Date dataValidade, int graduacaoAlcoolica) {
    super(nome, codigo, descricao, valor, dataFabricacao, dataValidade);
    this.graduacaoAlcoolica = graduacaoAlcoolica;
  }

  public int getGraduacaoAlcoolica() {
    return graduacaoAlcoolica;
  }

  public void setGraduacaoAlcoolica(int graduacaoAlcoolica) {
    this.graduacaoAlcoolica = graduacaoAlcoolica;
  }

  public String toString() {
    DateFormat brFormato = new SimpleDateFormat("dd/MM/yyyy");

    return "\nCódigo: " + getCodigo() + "\nNome: " + getNome() +
        "\nDescrição: " + getDescricao() + "\nValor: R$" + getValor() +
        "\nGraduação alcoólica: " + getGraduacaoAlcoolica() +
        "\nData de fabricação: " + brFormato.format(getDataFabricacao()) +
        "\nData de validade: " + brFormato.format(getDataValidade());
  }
}
