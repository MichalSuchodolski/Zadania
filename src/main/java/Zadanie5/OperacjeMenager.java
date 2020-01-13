package Zadanie5;


public class OperacjeMenager {


    public void add(double firstnumber, double secondnumber, Operation operation) {
        Queue queue = new Queue();
        queue.size();


        Command command = null;

        switch (operation) {
            case dodawanie:
                new dodawanie(firstnumber, secondnumber);
                break;
            case odejmowanie:
                new odejmowanie(firstnumber, secondnumber);
                break;
            case mnozenie:
                new mnozenie(firstnumber, secondnumber);
                break;
            case dzielenie:
                new dzielenie(firstnumber, secondnumber);
                break;
        }
        queue.push(command);

    }


    public void invoke() {

        int queuesize = 0;
        for (int i = 0; i < queuesize; i++) {

        }

    }
}
