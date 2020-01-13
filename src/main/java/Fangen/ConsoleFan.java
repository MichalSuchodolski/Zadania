package Fangen;



public class ConsoleFan extends Fangen{

    public ConsoleFan(int size, CharSet chars){
        super(size, chars);
        this.stream = System.out;
    }
}
