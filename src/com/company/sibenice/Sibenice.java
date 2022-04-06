package com.company.sibenice;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sibenice {
    public static void Dead(){
        Scanner letter = new Scanner(System.in);
        boolean hra  = true;
        boolean vyhra  = false;

        int[] abc = new int[27];
        for (int i = 0; i < 27; i++){
            abc[i] = 0;
        }
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        ArrayList<Character> abeceda = new ArrayList<>(Arrays.asList(alphabet));

        int[] abcx = new int[27];
        for (int i = 0; i < 27; i++){
            abcx[i] = 0;
        }

        ArrayList<String> slova = new ArrayList<>();
        slova.add("robot");


        Random slovo = new Random();
        String hadanka = slova.get(slovo.nextInt(1));

        int chyby = 0;
        int existuje = 0;

        ArrayList<Character> rozklad = new ArrayList<>();
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

        System.out.println("Jdeme hrát");
        System.out.println("Zde máš podlážky");
        for (int oi = 0; oi < rozklad.size(); oi++){
            if (abcx[oi] == 0){
                System.out.print("*");
            }
            else{
                System.out.print(abeceda.get(oi + 1));
            }
        }

        while(hra) {
            if (chyby < 10) {
                System.out.println("");
                System.out.println("Vypište písmeno");
                String input = letter.next();
                char vlozeno = input.charAt(0);
                int pozice = 0;

                boolean cekani = true;
                int poiu = 0;
                while (cekani) {
                    if (vlozeno == abeceda.get(poiu)) {
                        pozice = poiu;
                        cekani = false;
                    } else {
                        poiu++;
                    }
                }
                if (abc[pozice] > 0) {
                    System.out.println("Písmeno je ve slově");
                    abcx[pozice] += 1;
                    existuje++;

                    if (existuje == rozklad.size()){
                        hra = false;
                        vyhra = true;
                    }
                } else {
                    System.out.println("Chyba");
                    chyby++;
                }
                System.out.println("Počet chyb: " + chyby + "/10");
                System.out.println("");

                //TODO opravit vypisování písmen

                for (int oi = 0; oi < rozklad.size(); oi++) {
                    if (abcx[oi] == 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(abeceda.get(oi));
                    }
                }

            }
            else {
                System.out.println("");
                System.out.println("Prohrál si");
                hra = false;
            }
        }
        if (vyhra){
            System.out.println("Gratuluji");
            System.out.println("Vyhrál si");
        }
        }
    }
