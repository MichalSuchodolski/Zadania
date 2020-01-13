package List;

import java.util.Optional;
import static java.util.Arrays.asList;

public class ArrayList<T extends Comparable<T>, tab> implements List<T> {

    private static final int INITIAL_CAPACITY = 20;
    private Object[] tab;
    private int size = 0;




    public void Arraylist() {
        tab = new Object[size];
    }

    public void tabFull() {
        if (tab.length == size()) {
            Object[] newtab = new Object[tab.length + INITIAL_CAPACITY];
            for (int i = 0; i < tab.length; i++) {
                newtab[i] = tab[i];

            }
        }


    }

    @Override
    public void add(T object) {
        tabFull();
        tab[size++] = object;
    }

    @Override
    public T get(int index) {

        return (T)tab[index];
    }

    public Optional <Integer>find(Object object){
        for (int i = 0; i < tab.length; i++){
            if(tab[i].equals(object));
            return Optional.of(i);
        }

        return Optional.empty();

    }



    @Override
    public boolean remove(T object) {




        return true;
    }

    @Override
    public boolean addBefore(T before, T value) {


        return false;
    }

    @Override
    public boolean addAfter(T after, T value) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] asArray() {
        return new Object[0];
    }

    @Override
    public int size() {
        return size;
    }
}