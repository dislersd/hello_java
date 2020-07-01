package animalkingdom;

abstract class Animal {
  // protected = This class knows about name as well as children
  protected String name;
  protected int yearNamed;
  protected static int maxId = 0;
  protected int id;
  
  // public Animal() {
  //   maxId++;
  //   id = maxId;
  // }

  public Animal(String name, int yearNamed) {
    maxId++;
    id = maxId;
    this.name = name;
    this.yearNamed = yearNamed;
  }

  public String getName() {
    return name;
  }
  
  public int getYearNamed() {
    return yearNamed;
  }

  abstract String getBreath();
  abstract String getMovement();
  abstract String getReproduction();

  @Override
  public String toString() {
    return name + " " + getBreath() + " " + getMovement() + " " + getReproduction() + " " + id;
  }
}