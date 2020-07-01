package animalkingdom;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);

    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    System.out.println(panda.getBreath()); // lungs
    System.out.println(pigeon.getReproduction()); // eggs
    System.out.println(perch.getMovement()); // swim

    List<Animal> animalList = new ArrayList<>();

    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    animalList.forEach(e -> System.out.println(e));
  }
}