package Adega;

public class Adega {
  private int linha;
  private int coluna;
  private int quantidadeGarrafas;
  private Vinho[][] colmeia;

  public Adega() {
    this.linha = 0;
    this.coluna = 0;
    this.colmeia = new Vinho[20][10];
  }

  public Vinho[][] getColmeia() {
    return colmeia;
  }

  public void setColmeia(Vinho[][] colmeia) {
    this.colmeia = colmeia;
  }

  public int getQuantidadeGarrafas() {
    return quantidadeGarrafas;
  }

  public void setQuantidadeGarrafas(int quantidadeGarrafas) {
    this.quantidadeGarrafas = quantidadeGarrafas;
  }

  public void adicionarGarrafa(Vinho garrafa) {
    if (coluna < colmeia[linha].length) {
      colmeia[this.linha][this.coluna] = garrafa;
      this.coluna += 1;
      this.quantidadeGarrafas += 1;
    }

    if (coluna == colmeia[linha].length) {
      this.coluna = 0;
      this.linha += 1;
    }
  }

  public void ObterVinhoPorTipo(String tipo) {
    for (Vinho[] linha : colmeia) {
      for (Vinho coluna : linha) {
        if (coluna != null) {
          if (coluna.getTipoUva().equals(tipo)) {
            System.out.println(coluna.toString());
          }
        }
      }
    }
  }

  public int totalDeGarrafas() {
    return this.quantidadeGarrafas;
  }

  public double valorTotalAdega() {
    double valorTotal = 0;
    for (Vinho[] linha : colmeia) {
      for (Vinho coluna : linha) {
        if (coluna != null) {
          valorTotal += coluna.getValor();
        }
      }
    }

    return valorTotal;
  }

  public String vinhoMaisAntigo() {
    Vinho vinhoMaisAntigo = colmeia[0][0];
    for (Vinho[] linha : colmeia) {
      for (Vinho coluna : linha) {
        if (coluna != null) {
          if (coluna.getDataFabricacao().before(vinhoMaisAntigo.getDataFabricacao())) {
            vinhoMaisAntigo = coluna;
          }
        }
      }
    }

    return vinhoMaisAntigo.getNome();
  }

  public String obterVinho(int linha, int coluna) {
    if (colmeia[linha][coluna] != null) {
      return colmeia[linha][coluna].toString();
    } else {
      return "Não existe vinho nessa posição da adega";
    }
  }

  public void imprimirAdega() {
    for (Vinho[] linha : colmeia) {
      for (Vinho coluna : linha) {
        if (coluna != null) {
          System.out.println(coluna.toString());
        }
      }
    }
  }
}
