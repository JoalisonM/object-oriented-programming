public class Main {
  public static void main(String[] args) {
    TV samsung = new TV();

    ControleRemoto controle = new ControleRemoto(samsung);

    controle.ligar();
    System.out.println(samsung.toString());

    controle.aumentarVolume();
    System.out.println(samsung.toString());

    controle.diminuirVolume();
    System.out.println(samsung.toString());

    controle.trocarCanal(10);
    System.out.println(samsung.toString());

    controle.passar1Canal();

    controle.voltar1Canal();
    controle.voltar1Canal();
    controle.voltar1Canal();

    controle.desligar();
    System.out.println(samsung.toString());
  }
}
