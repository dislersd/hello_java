package transport;

public class Horse implements Vehicle, Animal {
  private int fuel = 0;
  private String name;

  public Horse(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getPath() {
    return "Grass";
  }

  @Override
  public void move() {
    fuel -= 1;
  }

  @Override
  public int getFuelLevel() {
    return fuel;
  }

  @Override
  public void addFuel(int i) {
    eat(i);
  }

  @Override
  public void eat(int i) {
    fuel += i;
  }

  @Override
  public String speak() {
    return "Neigh";
  }

  @Override
  public String toString(){
    return "Horse: " + "Name: " + name + " Fuel: " + fuel;
  }
}