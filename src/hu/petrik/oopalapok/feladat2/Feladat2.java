package hu.petrik.oopalapok.feladat2;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {

        Kor kor1 = new Kor(2, 5, 3);
        Kor kor2 = new Kor(20);

        System.out.printf("A megadott kör kerülete: %.3f\n",kor1.kerulet());
        System.out.printf("A random kör kerülete: %.3f\n",kor2.kerulet());
        System.out.printf("A megadott kör területe: %.3f\n",kor1.terulet());
        System.out.printf("A random kör területe: %.3f\n",kor2.terulet());

    }
}
