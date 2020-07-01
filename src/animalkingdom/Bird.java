package animalkingdom;

public class Bird extends Animal {
  public Bird(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String getBreath() {
    return "lungs";
  }
  @Override
  public String getMovement() {
    return "fly";
  }
  @Override
  public String getReproduction() {
    return "eggs";
  }
}