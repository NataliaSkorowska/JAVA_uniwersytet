package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner (System.in);

        System.out.println("Podaj liczbę, której parzystość chcesz sprawdzić");
        int liczba = wejscie.nextInt();

        if (liczba % 2 == 0) {
            System.out.println( liczba + " jest liczbą parzystą");
        }
        else {
            System.out.println(liczba + " nie jest liczbą parzystą");
        }


    }
}
