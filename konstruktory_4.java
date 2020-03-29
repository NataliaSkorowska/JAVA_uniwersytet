package com.company;

public class Main {
    public static void main(String[] args) {
        PrzykladPrzeciazenie przyklad1 = new PrzykladPrzeciazenie();

        przyklad1.wypisz(4);
        przyklad1.wypisz(5.7);
        przyklad1.wypisz("TEKST");
    }
}

class PrzykladPrzeciazenie {
    public void wypisz(int x) {
        System.out.println("int = " + x);
    }

    public void wypisz(double y) {
        System.out.println("double = " + y);
    }

    public void wypisz(String z) {
        System.out.println("String = " + z);
    }
}
