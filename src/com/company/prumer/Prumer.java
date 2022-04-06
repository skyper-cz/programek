package com.company.prumer;

import java.util.ArrayList;
import java.util.Scanner;

public class Prumer {
    public static void Average(){
        ArrayList<Integer> cisla = new ArrayList<Integer>();
        float soucet = 0;
        float pocet = 0;
        Scanner cislo = new Scanner(System.in);
        Scanner beho = new Scanner(System.in);
        System.out.println("Vložte číslo");
        while(cislo.hasNext()) {
            System.out.println("Vložte číslo");
            int pomocna = cislo.nextInt();
            cisla.add(pomocna);
        }
        for (int i = 0; i < cisla.size();i++) {
            soucet += cisla.get(i);
            pocet++;
        }
        float prumer = soucet/pocet;
        System.out.println(prumer);
    }
}
