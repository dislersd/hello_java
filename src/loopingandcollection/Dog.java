package loopingandcollection;

public class Dog {
  private String breed;
  private int avgWeight;
  private boolean apartment;

  public Dog(String breed, int avgWeight, boolean apartment) {
    this.breed = breed;
    this.avgWeight = avgWeight;
    this.apartment = apartment;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getAvgWeight() {
    return avgWeight;
  }

  public void setAvgWeight(int avgWeight) {
    this.avgWeight = avgWeight;
  }

  public boolean isApartment() {
    return apartment;
  }

  public void setApartment(boolean apartment) {
    this.apartment = apartment;
  }

  @Override
  public String toString() {
    return "Dog:" + " Breed = " + breed + " AvgWeight = " + avgWeight + " Apartment = " + apartment + "\n";
  }

}