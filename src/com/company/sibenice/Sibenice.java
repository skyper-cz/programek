package com.company.sibenice;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sibenice {
    public static void Dead(){
        Scanner letter = new Scanner(System.in);

        int[] abc = new int[27];
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        ArrayList<Character> abeceda = new ArrayList<Character>(Arrays.asList(alphabet));

        int[] abcx = new int[27];

        ArrayList<String> slova = new ArrayList<String>();
        slova.add("robot");
        slova.add("sesit");
        slova.add("lahev");
        slova.add("cepice");
        slova.add("mobil");
        slova.add("pocitac");
        slova.add("prodluzovak");
        slova.add("kabel");

        Random slovo = new Random();
        String hadanka = slova.get(slovo.nextInt(8));

        int chyby = 0;

        ArrayList<Character> rozklad = new ArrayList<Character>();
        for (int ou = 0; ou < hadanka.length(); ou++) {
            char pismenko =hadanka.charAt(ou);
            rozklad.add(pismenko);
        }

        for (int au = 0; au < rozklad.size(); au++){
            for (int ou = 0;ou < abeceda.size();ou++){
                if (rozklad.get(au) == abeceda.get(ou)) {
                    abc[ou]++;
                }
            }
        }
    }
}
