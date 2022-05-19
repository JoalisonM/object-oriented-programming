package Helicoptero;

public class Main {
  public static void main(String[] args) {
    Helicoptero bellAH1 = new Helicoptero(8);
    Helicoptero tiger = new Helicoptero(5);

    System.out.println(bellAH1.toString());
    System.out.println(tiger.toString());

    bellAH1.entrar(); // 1
    bellAH1.entrar(); // 2
    bellAH1.entrar(); // 3
    bellAH1.entrar(); // 4
    bellAH1.entrar(); // 5
    bellAH1.entrar(); // 6
    bellAH1.entrar(); // 7
    bellAH1.entrar(); // 8
    bellAH1.entrar(); // 9
    bellAH1.entrar(); // 10

    tiger.entrar(); // 1
    tiger.entrar(); // 2
    tiger.entrar(); // 3
    tiger.entrar(); // 4

    bellAH1.ligar();
    tiger.ligar();

    bellAH1.decolar(10.0);
    tiger.decolar(20.2);

    System.out.println(bellAH1.toString());
    System.out.println(tiger.toString());

    bellAH1.aterrissar();
    tiger.aterrissar();

    bellAH1.desligar();
    tiger.desligar();

    bellAH1.sair();
    bellAH1.sair();
    bellAH1.sair();
    bellAH1.sair();
    bellAH1.sair();
    bellAH1.sair();
    bellAH1.sair();
    bellAH1.sair();

    tiger.sair();
    tiger.sair();
    tiger.sair();
    tiger.sair();

    System.out.println(bellAH1.toString());
    System.out.println(tiger.toString());
  }
}
