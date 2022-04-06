package com.company;

import java.util.Objects;
import java.util.Scanner;

import static com.company.kamennuzkypapir.Kamennuzkypapir.Rockpaperscissors;
import static com.company.prumer.Prumer.Average;
import static com.company.sibenice.Sibenice.Dead;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    boolean beh = true;
    System.out.println("Vyberte si hru");
    System.out.println("Šibenice, KámenNůžkyPapír, Průměr");


    while(beh) {
        String vyber = sc.next();
        if (Objects.equals(vyber, "Šibenice")) {
            Dead();
            beh = false;
        } else if (Objects.equals(vyber, "KámenNůžkyPapír")) {
            Rockpaperscissors();
            beh = false;
        } else if (Objects.equals(vyber, "Průměr")) {
            Average();
            beh = false;
        } else {
            System.out.println("Chyba, zadejte správný tvar");
        }
    }
    }
}
