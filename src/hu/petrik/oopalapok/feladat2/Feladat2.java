package hu.petrik.oopalapok.feladat2;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {

        Kor kor1 = new Kor(2, 5, 4);
        Kor kor2 = new Kor(10);
        Kor kor3= new Kor(10);
        Kor kor4 = new Kor(10);
        Kor kor5= new Kor(10);
        Kor kor6 = new Kor(10);
        Kor kor7= new Kor(10);
        Kor kor8 = new Kor(10);
        Kor kor9= new Kor(10);
        Kor kor10 = new Kor(10);





        System.out.printf("1. kör: %s, kerülete: %.3f, területe: %.3f\n",kor1, kor1.kerulet(), kor1.terulet());
        System.out.printf("2. kör: %s, kerülete: %.3f, területe: %.3f\n",kor2,kor2.kerulet(), kor2.terulet());
        System.out.printf("3. kör: %s, kerülete: %.3f, területe: %.3f\n",kor3,kor3.kerulet(), kor3.terulet());
        System.out.printf("4. kör: %s, kerülete: %.3f, területe: %.3f\n",kor4,kor4.kerulet(), kor4.terulet());
        System.out.printf("5. kör: %s, kerülete: %.3f, területe: %.3f\n",kor5,kor5.kerulet(), kor5.terulet());
        System.out.printf("6. kör: %s, kerülete: %.3f, területe: %.3f\n",kor6,kor6.kerulet(), kor6.terulet());
        System.out.printf("7. kör: %s, kerülete: %.3f, területe: %.3f\n",kor7,kor7.kerulet(), kor7.terulet());
        System.out.printf("8. kör: %s, kerülete: %.3f, területe: %.3f\n",kor8,kor8.kerulet(), kor8.terulet());
        System.out.printf("9. kör: %s, kerülete: %.3f, területe: %.3f\n",kor9,kor9.kerulet(), kor9.terulet());
        System.out.printf("10. kör: %s, kerülete: %.3f, területe: %.3f\n",kor10,kor10.kerulet(), kor10.terulet());


        int index = 0;
        int max = 0;
        Kor[] sugarak = new Kor[]{kor1,kor2,kor3,kor4,kor5,kor6,kor7,kor8,kor9,kor10};
        for (int i = 0; i < sugarak.length; i++) {
            if (max < sugarak[i].getR()){
                max = sugarak[i].getR();
                index = i;
            }
        }
        System.out.printf("A legnagyobb a(z) %d. kör", index);
    }
}
