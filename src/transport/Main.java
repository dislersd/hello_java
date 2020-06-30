package transport;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("\n *** Working with interfaces");

    Horse seabiscut = new Horse("Seabiscut");
    Horse affirmed = new Horse("Affirmed");
    Horse joe = new Horse("Joe");

    seabiscut.eat(10);
    affirmed.eat(25);
    seabiscut.move();
    seabiscut.move();
    seabiscut.move();
    System.out.println("Seabiscut " + seabiscut.getFuelLevel());

    System.out.println("\n\n *** Abstract Classes");

    HorseFromVehicle spirit = new HorseFromVehicle("Sprit", 10);
    spirit.addFuel(10);

    HorseFromVehicle boomerang = new HorseFromVehicle("Boomerang"); // No fuel passed in args so this looks to abstract
                                                                    // class which has a defualt constructor that sets
                                                                    // fuel to 1.
    boomerang.move(10);

    HorseFromVehicle trigger = new HorseFromVehicle("Trigger");
    HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah");
    HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew");

    Auto vw = new Auto(1, "EuroVan", 2000);
    Auto toyota = new Auto(10, "Tundra", 1998);
    Auto honda = new Auto(5, "Accord", 2003);

    vw.move();
    vw.move(5);

    List<AbstractVehicle> myList = new ArrayList(); // Because HorseFromVehicle and Auto both have AbstractVehicle as a
                                                    // parent they can both be added into one list together
    myList.add(spirit);
    myList.add(boomerang);
    myList.add(trigger);
    myList.add(americanPharoah);
    myList.add(seattleSlew);
    myList.add(vw);
    myList.add(toyota);
    myList.add(honda);
  }
}