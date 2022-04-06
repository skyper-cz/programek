package com.company.kamennuzkypapir;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Kamennuzkypapir {
    public static void Rockpaperscissors(){
        Scanner vklad = new Scanner(System.in);
        Random pocitac = new Random();
        int scorePL = 0;
        int scorePC = 0;
        String slovo = null;

        while(vklad.hasNext()){
            System.out.println("kámen, nůžky, nebo papír");
            slovo = vklad.next();
            int predmet = pocitac.nextInt(3);
            
            if(Objects.equals(slovo, "kámen") && predmet == 0){
                System.out.println("Remíza");
            }
            else if(Objects.equals(slovo, "kámen") && predmet == 1){
                System.out.println("Vyhral jsi");
                scorePL++;
            }
            else if(Objects.equals(slovo, "kámen") && predmet == 2){
                System.out.println("Prohral jsi");
                scorePC++;
            }
            else if(Objects.equals(slovo, "nůžky") && predmet == 0){
                System.out.println("Prohral jsi");
                scorePC++;
            }
            else if(Objects.equals(slovo, "nůžky") && predmet == 1){
                System.out.println("Remíza");
            }
            else if(Objects.equals(slovo, "nůžky") && predmet == 2){
                System.out.println("Vyhral jsi");
                scorePL++;
            }
            else if(Objects.equals(slovo, "papír") && predmet == 0){
                System.out.println("Vyhral jsi");
                scorePL++;
            }
            else if(Objects.equals(slovo, "papír") && predmet == 1){
                System.out.println("Prohral jsi");
                scorePC++;
            }
            else if(Objects.equals(slovo, "papír") && predmet == 2){
                System.out.println("Remíza");
            }
            System.out.println("Současné score je: " + scorePL + " : " + scorePC);
            
        }
    }
}
