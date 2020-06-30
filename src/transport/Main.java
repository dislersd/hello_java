package transport;

public class Main {
  public static void main(String[] args) {
    System.out.println("\n *** Working with interfaces");

    Horse seabiscut = new Horse("Seabiscut");
    Horse affirmed = new Horse("Affirmed");
    Horse joe = new Horse("Joe");

    seabiscut.eat(10);
    affirmed.eat(25);
    seabiscut.move();
    seabiscut.move();
    seabiscut.move();
    System.out.println("Seabiscut " + seabiscut.getFuelLevel());
  }
}