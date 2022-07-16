package Mercadinho;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Mercadinho {
  private String nome;
  private int quantidade;
  private Produto[] estoque;
  private Proprietario proprietario;

  public Mercadinho(String nome, Proprietario proprietario) {
    this.nome = nome;
    this.quantidade = 0;
    this.estoque = new Produto[1000];
    this.proprietario = proprietario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Proprietario getProprietario() {
    return proprietario;
  }

  public void setProprietario(Proprietario proprietario) {
    this.proprietario = proprietario;
  }

  public Produto[] getEstoque() {
    return estoque;
  }

  public void setEstoque(Produto[] estoque) {
    this.estoque = estoque;
  }

  public boolean cadastrarProduto(Produto produto) {
    if (this.quantidade <= estoque.length - 1) {
      this.estoque[this.quantidade++] = produto;

      System.out.println("Produto cadastrado com sucesso!!!");

      return true;
    } else {
      System.out.printf("O estoque já atingiu a capacidade máxima [%d]", estoque.length);

      return false;
    }
  }

  public void consultarProduto(String nome) {
    for (Produto produto : estoque) {
      if (produto != null) {
        if (produto.getNome().equals(nome)) {
          System.out.println(produto.toString());
        }
      }
    }
  }

  public void todosProdutos() {
    for (Produto produto : estoque) {
      if (produto != null) {
        System.out.println(produto.toString());
      }
    }
  }

  public void editarProduto(
      String codigo,
      String nome,
      String descricao,
      double valor,
      Date dataFabricacao,
      Date dataValidade) {

    if (estoque[0] == null) {
      System.out.println("Não há produtos no estoque");
    }

    for (Produto produto : estoque) {
      if (produto != null) {
        if (produto.getCodigo().equals(codigo)) {
          produto.setNome(nome);
          produto.setDescricao(descricao);
          produto.setValor(valor);
          produto.setDataFabricacao(dataFabricacao);
          produto.setDataValidade(dataValidade);
        }
      }
    }
  }

  public void removerProduto(String codigo) {
    for (int i = 0; i < estoque.length; i++) {
      if (estoque[i] != null) {
        if (estoque[i].getCodigo().equals(codigo)) {
          estoque[i] = null;
          this.quantidade -= 1;
          System.out.println("Produto removido com sucesso!!!");
        }
      }
    }
  }

  public int quantidadeProdutosCadastrados() {
    return quantidade;
  }

  public double calcularTotal() {
    double valorTotal = 0;
    for (Produto produto : this.estoque) {
      if (produto != null) {
        valorTotal += produto.getValor();
      }
    }

    return valorTotal;
  }

  public String produtoMaisAntigo() {
    Produto dataMaisAntiga = this.estoque[0];
    for (Produto produto : this.estoque) {
      if (produto != null) {
        if (produto.getDataFabricacao().before(dataMaisAntiga.getDataFabricacao())) {
          dataMaisAntiga = produto;
        }
      }
    }
    return dataMaisAntiga.getNome();
  }

  public void produtosVencidos() throws ParseException {
    Date dataAtual = new Date();
    DateFormat brFormato = new SimpleDateFormat("dd/MM/yyyy");
    String dataAtualFormatadaParaPtBR = brFormato.format(dataAtual);

    for (Produto produto : estoque) {
      if (produto != null) {
        if (produto.getDataValidade().before(brFormato.parse(dataAtualFormatadaParaPtBR))) {
          System.out.println("Produto vencido: " + produto.getNome());
        }
      }
    }
  }
}