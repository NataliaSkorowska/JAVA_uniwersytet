package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int liczba1 = wejscie.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int liczba2 = wejscie.nextInt();

        int tmp;

        tmp = liczba1;
        liczba1 = liczba2;
        liczba2 = tmp;

        System.out.println("Po zamianie liczba pierwsza to " + liczba1 + ", a liczba druga to " + liczba2);



    }
}
