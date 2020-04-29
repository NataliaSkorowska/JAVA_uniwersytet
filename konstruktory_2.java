package com.company;

public class Main {
    public static void main(String[] args) {
        PrzykladDwa x = new PrzykladDwa();
        PrzykladDwa y = new PrzykladDwa(3.5);
        PrzykladDwa z = new PrzykladDwa(4.3, 8.1);
        x.wypisz();
        y.wypisz();
        z.wypisz();
    }
}

class PrzykladDwa {
    double prawdziwy;
    double wyimaginowany;

    public void wypisz() {
        System.out.println(prawdziwy + "+i " + wyimaginowany);
    }

    PrzykladDwa() {
        prawdziwy = 0;
        wyimaginowany = 0;
    }

    PrzykladDwa(double wartosc) {
        prawdziwy = wartosc;
        wyimaginowany = 0;
    }

    PrzykladDwa(double wartosc3, double wartosc4) {
        prawdziwy = wartosc3;
        wyimaginowany = wartosc4;
    }

}
