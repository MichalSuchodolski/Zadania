package Symulacja.Animal;


import Symulacja.Food.Food;

public abstract class Dog implements Animal{


    @Override
    public boolean feed(Food food) {
        return false;
    }

    @Override
    public void enlargeHunger(int amount) {

    }

    @Override
    public AnimalFamily getFamily() {
        return null;
    }

    @Override
    public boolean isHungry() {
        return false;
    }
}
