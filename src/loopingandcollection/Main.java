package loopingandcollection;

import java.util.*;

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
    System.out.println("\n Not good for apartments");

    for (int i = 0; i < dogArr.length; i++) {
      if (dogArr[i].isApartment()) {
        continue;
      }
      System.out.print(dogArr[i]);
    }

    for (Dog d : dogArr) {
      System.out.print(d);
    }

    // Type Info
    // int, boolean, double, char (standalone types aka primitive types)
    // Object -> String (String is a child of Object)
    // Object -> Array (Array is child of Object)
    // Object -> Collections -> List -> ArrayList ()

    System.out.println("\n\n*** ArrayLists");
    List<Dog> dogArrayList = new ArrayList<>(); // List can only contain one type of element, here it is Dog
    dogArrayList.addAll(Arrays.asList(dogArr)); // taking our arraylist, dogArr is converted to a list using .asList(),
                                                // adding all dogArr elements to arraylist
    dogArrayList.add(new Dog("Mutt", 15, true));

    for (Dog d : dogArrayList) {
      System.out.print(d);
    }

    System.out.println();
    for (Dog d: dogArrayList) {
      System.out.print(d.getBreed() + " are ");

      switch(d.getAvgWeight()) {
        case 5:
          System.out.print(d.getAvgWeight() + " very small ");
          break;
        case 15:
          System.out.print(d.getAvgWeight() + " small ");
          break;
        case 25:
          System.out.print(d.getAvgWeight() + " medium ");
          break;
        case 35:
          System.out.print(d.getAvgWeight() + " large ");
          break;
        case 45:
          System.out.print(d.getAvgWeight() + " very large ");
          break;
        default:
          System.out.print(d.getAvgWeight() + " unknown ");
      }
      System.out.println(" dogs");
    }
  }
}