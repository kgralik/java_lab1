import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek: ");
        String wiek = scan.next();
        System.out.print("Podaj nr indeksu: ");
        String indeks = scan.next();
        System.out.printf("Imię: " + imie + "%n" + "Nazwisko: " + nazwisko + "%n" + "Wiek: " + wiek + "%n" + "Numer indeksu: " + indeks + "%n");


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.println("Cwiczenie 3");
        System.out.println("zad1 a");
        Scanner scan = new Scanner(System.in);
        Scanner kalkulator = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:");
        Double a = kalkulator.nextDouble();
        System.out.print("Podaj drugą liczbę");
        Double b = kalkulator.nextDouble();
        System.out.println("a = " + a + "%n" + "b = " + b);

    }
}
