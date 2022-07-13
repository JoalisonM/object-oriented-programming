package Atividade1.GuerreirosPOO;

import java.util.Random;

public class Guerreiro {
  private int energia;
  private String codigo, nome;

  public Guerreiro(String codigo, String nome) {
    this.nome = nome;
    this.energia = 5;
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public int getEnergia() {
    return energia;
  }

  public void setEnergia(int energia) {
    this.energia = energia;
  }

  public void incremento() {
    if (energia < 5) {
      setEnergia(getEnergia() + 1);
    }
  }

  public void decremento() {
    if (energia > 0) {
      setEnergia(getEnergia() - 1);
    } else {
      System.out.printf("O guerreiro [%s] está sem energia\n", nome);
    }
  }

  public void alimentarSe() {
    this.incremento();
    System.out.printf("O guerreiro [%s] foi alimentado\n", nome);
  }

  public int atacar() {
    Random ataque = new Random();

    return ataque.nextInt(2);
  }

  public void lutarComLaco(Guerreiro guerreiro) {
    while (this.getEnergia() > 0 && guerreiro.getEnergia() > 0) {
      int ataque1 = this.atacar();
      int ataque2 = guerreiro.atacar();

      if (ataque1 > 0) {
        guerreiro.decremento();
      }

      if (ataque2 > 0) {
        this.decremento();
      }

      if (this.getEnergia() == 0 && guerreiro.getEnergia() == 0) {
        System.out.println("Empate!!!\n");
      }

      if (this.getEnergia() == 0) {
        System.out.printf("O guerreiro [%s] foi o ganhador, ele terminou a luta com %d de energia \n",
            guerreiro.getNome(), guerreiro.getEnergia());
        break;
      }

      if (guerreiro.getEnergia() == 0) {
        System.out.printf("O guerreiro [%s] foi o ganhador, ele terminou a luta com %d de energia\n",
            this.getNome(), this.getEnergia());
        break;
      }
    }
  }

  public String lutarRecursivo(Guerreiro guerreiro) {
    int ataqueGuerreiro1 = this.atacar();
    int ataqueGuerreiro2 = guerreiro.atacar();

    if (ataqueGuerreiro1 > 0) {
      guerreiro.decremento();
    }

    if (ataqueGuerreiro2 > 0) {
      this.decremento();
    }

    if (this.getEnergia() == 0 && guerreiro.getEnergia() == 0) {
      return "Empate!!!\n";
    }

    if (this.getEnergia() == 0) {
      return "O guerreiro " + "[" + guerreiro.getNome() + "]" + " foi o ganhador, ele terminou a luta com "
          + guerreiro.getEnergia()
          + " de energia";
    }

    if (guerreiro.getEnergia() == 0) {
      return "O guerreiro " + "[" + this.getNome() + "]" + " foi o ganhador, ele terminou a luta com "
          + this.getEnergia()
          + " de energia";
    }

    return lutarRecursivo(guerreiro);
  }

  @Override
  public String toString() {
    return "Código: " + codigo + " -- " + "Nome: " + nome + " -- " + "Energia: " + energia;
  }
}
