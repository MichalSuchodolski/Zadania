package Symulacja.Animal.AnimalRace;





import Symulacja.Animal.Animal;
import Symulacja.Animal.AnimalFamily;
import Symulacja.Animal.Bird;
import Symulacja.Food.Food;


public class CanaryBird extends Bird implements Animal {

    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }


    @Override
    public String introduceYourself() {
        return null;
    }

    @Override
    public void speak() {

    }
}
