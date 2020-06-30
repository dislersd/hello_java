package transport;

abstract class AbstractVehicle {
  protected int fuel;

  public AbstractVehicle() {
    fuel = 1;
  }

  public AbstractVehicle(int fuel) {
    this.fuel = fuel;
  }

  abstract String getPath();

  abstract String getName();

  void move() {
    fuel--;
  }

  void move(int steps) {
    fuel -= steps;
  }

  int getFuelLevel() {
    return fuel;
  }

  void addFuel(int i) {
    fuel += i;
  }
}