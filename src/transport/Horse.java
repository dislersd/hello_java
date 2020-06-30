package transport;

public class Horse implements Vehicle, Animal {
  private int fuel = 0;
  private String name;

  public Horse(String name) {
    this.name = name
  }
  
  
  String getPath();
  void move();
  int getFuelLevel();
  void addFuel();
  void eat(int i);
  String speak();
}