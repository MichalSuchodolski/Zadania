package Symulacja.Animal.AnimalRace;


import Symulacja.Animal.Animal;
import Symulacja.Animal.AnimalFamily;
import Symulacja.Animal.Dog;
import Symulacja.Food.Food;

public class HuskeyDog extends Dog implements Animal {

    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    @Override
    public String introduceYourself() {
        return null;
    }

    @Override
    public void speak() {

    }
}
