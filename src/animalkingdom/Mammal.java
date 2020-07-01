package animalkingdom;

public class Mammal extends Animal {

  public Mammal(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String getBreath() {
    return "lungs";
  }
  @Override
  public String getMovement() {
    return "walk";
  }
  @Override
  public String getReproduction() {
    return "live birth";
  }
}