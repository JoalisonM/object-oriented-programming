package Biblioteca;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Usuario jooj = new Usuario("Jooj", "83991353102", "202113810007", 111111);

    Livro extraordinario = new Livro("Extraordinário", "R. J. Palacio", "Alfred A. Knopf", "xablau", new Date(), 1);

    Exemplar exemplar = new Exemplar(1, false, false, extraordinario);

    Emprestimo empres_jooj = new Emprestimo(new Date(), new Date(), new Date(), 7, jooj, exemplar);
  }
}
