package com.company.sibenice;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Sibenice {
    public static void Dead(){
        Scanner letter = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;

        int ax = 0;
        int bx = 0;
        int cx = 0;
        int dx = 0;
        int ex = 0;
        int fx = 0;
        int gx = 0;
        int hx = 0;
        int ix = 0;
        int jx = 0;
        int kx = 0;
        int lx = 0;
        int mx = 0;
        int nx = 0;
        int ox = 0;
        int px = 0;
        int qx = 0;
        int rx = 0;
        int sx = 0;
        int tx = 0;
        int ux = 0;
        int vx = 0;
        int wx = 0;
        int xx = 0;
        int yx = 0;
        int zx = 0;

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
            if (rozklad.get(au).charValue()){
                a++;
            }
        }
    }
}
