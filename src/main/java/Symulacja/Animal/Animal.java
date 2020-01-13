package Symulacja.Animal;

import Symulacja.Food.Food;

public interface Animal {

    boolean feed (Food food);
    String introduceYourself();
    void speak();
    void enlargeHunger(int amount);
    AnimalFamily getFamily();
    boolean isHungry();


}
