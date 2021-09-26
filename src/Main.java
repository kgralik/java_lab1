import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        System.out.println("Cwiczenie 1");
        byte zmienna1 = 24;
        short zmienna2 = 32425;
        int zmienna3 = 777777;
        long zmienna4 = -54984545;
        float zmienna5 = 24.45f;
        double zmienna6 = 548.554;
        boolean zmienna7 = true;
        char zmienna8 = 't';
        System.out.println(zmienna1);
        System.out.println(zmienna2);
        System.out.println(zmienna3);
        System.out.println(zmienna4);
        System.out.println(zmienna5);
        System.out.println(zmienna6);
        System.out.println(zmienna7);
        System.out.println(zmienna8);

        System.out.println("Cwiczenie 2");
        System.out.println("czesc pierwsza");

        int A = 1584;
        int B = 5874;
        int Wynikdodawanie = A + B;
        System.out.println(Wynikdodawanie);
        int Wynikodejmowanie = A - B;
        System.out.println(Wynikodejmowanie);
        int Wynikmnozenie = A * B;
        System.out.println(Wynikmnozenie);
        int Wynikdzielenie = A / B;
        System.out.println(Wynikdzielenie);
        int modulo = A % B;
        System.out.println(modulo);
        System.out.println("czesc druga:");

        double A1= 997.98;
        double B1 = 5481.87;

        double Wynikdodawanie1 = A1 + B1;
        System.out.println(Wynikdodawanie1);
        double Wynikodejmowanie1 = A1 - B1;
        System.out.println(Wynikodejmowanie1);
        double Wynikmnozenie1 = A1 * B1;
        System.out.println(Wynikmnozenie1);
        double Wynikdzielenie1 = A1 / B1;
        System.out.println(Wynikdzielenie1);
        double modulo1 = A1 % B1;
        System.out.println(modulo1);









    }
}
