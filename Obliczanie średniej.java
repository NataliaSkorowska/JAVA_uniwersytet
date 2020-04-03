package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj liczbę 1: ");
        double liczba1 = wejscie.nextInt();

        System.out.println("Podaj liczbę 2: ");
        double liczba2 = wejscie.nextInt();

       double wynik = (liczba1 + liczba2)/2;

        System.out.println("Średnia podanych liczb wynosi " + wynik);

    }
}
