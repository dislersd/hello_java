package animalkingdom;

public class Fish extends Animal {
  public Fish(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String getBreath() {
    return "gills";
  }
  @Override
  public String getMovement() {
    return "swim";
  }
  @Override
  public String getReproduction() {
    return "eggs";
  }
}