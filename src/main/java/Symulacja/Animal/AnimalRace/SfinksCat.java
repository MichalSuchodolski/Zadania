package Symulacja.Animal.AnimalRace;


import Symulacja.Animal.Animal;
import Symulacja.Animal.AnimalFamily;
import Symulacja.Animal.Cat;
import Symulacja.Food.Food;

public class SfinksCat extends Cat implements Animal {

    private double coatlength;

    public double getCoatlength() {
        return coatlength;
    }

    public void setCoatlength(double coatlength) {
        this.coatlength = coatlength;
    }


    @Override
    public String introduceYourself() {
        return null;
    }

    @Override
    public void speak() {

    }
}
