package Car;

public class Car {
  // Attributes
  private String name;
  private double value;
  private int speed;
  private int gear;

  // Constructor
  public Car(String name, double value) {
    this.name = name;
    this.value = value;
    this.speed = 0;
    this.gear = 0;
  }

  // Methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void speedUp(int speedUp) {
    int cont = 0;
    while (cont < speedUp) {
      this.setSpeed(this.getSpeed() + 1);
      this.changeGear(this.getSpeed());
      cont += 1;
    }
    System.out.println("Velocidade Atual: " + this.getSpeed() + "Km");
    System.out.println("Marcha atual: " + this.getGear());
  }

  public void brake(int brake) {
    if (this.getSpeed() > 0) {
      int cont = 0;
      System.out.println("Velocidade Atual do carro: " + this.getSpeed() + "Km");
      if (brake <= this.getSpeed()) {
        while (cont < brake) {
          this.setSpeed(this.getSpeed() - 1);
          System.out.println("Freando: " + this.getSpeed());
          cont += 1;
        }
      } else {
        System.out
            .println("Velocidade a se frear " + brake + "Km maior que a velocidade atual " + this.getSpeed() + "Km");
      }
    } else {
      System.out.println("O carro não está em movimento");
    }
  }

  public void changeGear(int speed) {
    if (speed == 0) {
      System.out.println("Marcha neutra");
    } else if (speed > 0 && speed <= 10) {
      this.setGear(1);
    } else if (speed > 10 && speed <= 20) {
      this.setGear(2);
    } else if (speed > 20 && speed <= 40) {
      this.setGear(3);
    } else if (speed > 40 && speed <= 70) {
      this.setGear(4);
    } else {
      this.setGear(5);
    }
  }
}