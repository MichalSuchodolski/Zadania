package Zadaniadomowe2;

import java.util.Scanner;

public class nettobrutto {




        public static void main (String[] args)
        {
            Scanner dane = new Scanner(System.in);
            int koniec = 1;
            while (koniec == 1)
            {
                System.out.println("Program liczący wyagrodzenie netto");
                System.out.println("Jaka wartość Cię interesuje");
                System.out.println("1 - wynagrodzenie netto");
                System.out.println("2 - koszt pracodawcy");
                int wartosc=dane.nextInt();
                switch (wartosc)
                {
                    case 1:
                        System.out.println("Podaj wartość wynagrodzenia brutto");
                        double b=dane.nextDouble();
                        if (b<0) {
                            System.out.println("wartość wynagrodzenia brutto msi być dodatnia.");
                            break;
                        }
                        double UE = 0.0976*b;
                        System.out.printf("Ubezpieczenie emerytalne wynosi: %1.2f %n", UE);
                        double UR = 0.015*b;
                        System.out.printf("Ubezpieczenie rentowe wynosi: %1.2f %n", UR);
                        double UCH = 0.0245*b;
                        System.out.printf("Ubezpieczenie chorobowe wynosi: %1.2f %n", UCH);
                        double UZ = (b-(UE+UR+UCH))*0.09;
                        System.out.printf("Ubezpieczenie zdrowotne wynosi: %1.2f %n", UZ);
                        System.out.println("Czy pracujesz w miejscu zamieszkania?");
                        double PO;
                        System.out.println("1 - Tak	2 - Nie");
                        int mz = dane.nextInt();
                        if (mz == 1) {
                            PO = (b-(UE+UR+UCH))-111.25;
                            System.out.printf("Podstawa wynagrodzenia wynosi: %1.2f %n",PO);
                        }
                        else {
                            PO = (b-(UE+UR+UCH))-139.06;
                            System.out.printf("Podstawa wynagrodzenia wynosi: %1.2f %n",PO);
                        }
                        double ZALP = (PO*0.18-46.33)-((b-(UE+UR+UCH))*0.075);
                        System.out.printf("Zaliczka na PIT wynosi: %1.2f %n",ZALP);
                        double WN = ((b-(UE+UR+UCH))-((b-(UE+UR+UCH))*0.09))-ZALP;
                        System.out.printf("Wynagrodzenie netto wynosi: %1.2f %n", WN);
                        break;
                    case 2:
                        System.out.println("Podaj wartość wynagrodzenia brutto pracownika");
                        double b2 = dane.nextDouble();
                        if (b2<0) {
                            System.out.println("Wynagrodzenie brutto pracownika musi być dodatnie.");
                            break;
                        }
                        double tablica []=new double[7];
                        tablica[0] = b2*0.0976;
                        tablica[1] = b2*0.065;
                        tablica[2] = b2*0.0193;
                        tablica[3] = b2*0.0245;
                        tablica[4] = b2*0.001;
                        tablica[5] = 0.0976*b2+0.065*b2+0.0193*b2+0.0245*b2+0.001*b2;
                        tablica[6] = b2+tablica[5];
                        int c=0; do{
                        System.out.print("------------");
                        c++; } while (c<7);
                        System.out.println("Ub. emerytalne\tUb. rentowe\tUb. wypadkowe\tSkł. na fundusz pracy\tSkł. FGŚP\tSkł. obciążająca pracodawcę\tŁączny koszt");
                        for(double x : tablica) {
                            System.out.printf(x + "\t");
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Wybrana opcja nie istnieje.");
                        break;
                }
                System.out.println("Czy kontynuować obliczenia?");
                System.out.println("1 - TAK	2 - NIE");
                koniec = dane.nextInt();
            }
        }

}
