package com.company;

public class Main {
    public static void main(String[] args) {

        Przykład y = new Przykład ();
        Przykład x = new Przykład(20);
        y.wypisz();
        x.wypisz();
    }
}
class Przykład {
    int wartosc;
    public void wypisz() {
        System.out.println(wartosc);
    }
    Przykład() {
        wartosc = 10;
    }
    Przykład(int wartosc2) {
        wartosc = wartosc2;
    }
}


