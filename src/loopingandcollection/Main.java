package loopingandcollection;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Running");

    System.out.println("\n\n*** Arrays ****");

    Dog[] dogArr = new Dog[5]; // indexed 0...4
    dogArr[0] = new Dog("Springer", 50, false);
    dogArr[1] = new Dog("Bulldog", 45, true);
    dogArr[2] = new Dog("Collie", 45, false);
    dogArr[3] = new Dog("Chihuahua", 5, true);
    dogArr[4] = new Dog("Corgie", 35, true);
    System.out.println("Pointer: " + dogArr.toString());
    System.out.println(Arrays.toString(dogArr));
  }
}