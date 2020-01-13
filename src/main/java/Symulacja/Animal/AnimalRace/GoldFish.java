package Symulacja.Animal.AnimalRace;


import Symulacja.Animal.Animal;
import Symulacja.Animal.AnimalFamily;
import Symulacja.Animal.Fish;
import Symulacja.Food.Food;

public class GoldFish extends Fish implements Animal {
    private double swimmingSpeed;

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


    @Override
    public String introduceYourself() {
        return null;
    }

    @Override
    public void speak() {

    }
}
