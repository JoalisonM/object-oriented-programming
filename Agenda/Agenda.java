package Agenda;

public class Agenda {
  private Pessoa[] pessoas;
  private int quantidadePessoas;

  public Agenda(int quantidadePessoas) {
    this.quantidadePessoas = 0;
    this.pessoas = new Pessoa[quantidadePessoas];
  }

  public boolean addPessoa(Pessoa pessoa) {
    if (quantidadePessoas <= this.pessoas.length - 1) {
      this.pessoas[this.quantidadePessoas++] = pessoa;

      return true;
    }

    return false;
  }

  public String nomeDaPessoaMaisNova() {
    if (this.quantidadePessoas == 0) {
      return null;
    }

    Pessoa menorIdade = this.pessoas[0];
    for (Pessoa pessoa : this.pessoas) {
      if (pessoa.getIdade() < menorIdade.getIdade()) {
        menorIdade = pessoa;
      }
    }

    return menorIdade.getNome();
  }
}
