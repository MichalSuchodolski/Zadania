package HelloWord;

public class HelloWord {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Hello Unknown");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Hallo");
        for (String name: args) {
            stringBuilder.append(", ").append(name);

        }
        System.out.println(stringBuilder.toString());



    }
}
