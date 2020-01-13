package SKARBFI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Skarbfi {

    public static void main(String[] args) throws IOException {
        List<Liczba> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader.readLine());
        int a, b;
        int poziomo, pionowo, n;
        String ab[];
        if (d >= 1 && d <= 50) {
            for (int i = 0; i < d; i++) {
                n = Integer.parseInt(reader.readLine());
                poziomo = pionowo = a = b = 0;
                if (n >= 0 && n <= 100000) {
                    for (int j = 0; j < n; j++) {
                        ab = reader.readLine().split(" ");
                        a = Integer.parseInt(ab[0]);
                        b = Integer.parseInt(ab[1]);

                        switch (a) {
                            case 0:
                                poziomo += b;
                                break;
                            case 1:
                                poziomo -= b;
                                break;
                            case 2:
                                pionowo += b;
                                break;
                            case 3:
                                pionowo -= b;
                                break;
                        }


                    }
                    Liczba w = new Liczba(poziomo, pionowo);
                    list.add(w);
                } else {
                    System.exit(0);

                }

            }

        } else System.exit(0);
        for (int i = 0; i < d; i++) {
            poziomo = list.get(i).h;
            pionowo = list.get(i).v;

            if (pionowo == 0 && poziomo == 0) {
                System.out.println("studnia");
            } else {
                if (poziomo > 0) {
                    System.out.println("0" + poziomo);
                } else if (poziomo < 0) {
                    System.out.println("1" + Math.abs(poziomo));

                }
                if (pionowo > 0) {
                    System.out.println("2" + pionowo);

                } else if (poziomo < 0) {
                    System.out.println("3" + Math.abs(pionowo));
                }
            }


        }
    }


}


