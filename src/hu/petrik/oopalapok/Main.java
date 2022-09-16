package hu.petrik.oopalapok;

import hu.petrik.oopalapok.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(3, 6);
        Pont p3 = new Pont(100);
        System.out.println(p1);
        System.out.println(p2);
        System.out.printf("A(z) %s pont távolsága az origótól %.3f\n", p3, p3.getTavolsagAzOrigotol());
        System.out.printf("A(z) %s pont távolsága az %s ponttól %.3f\n",p2, p3, p2.tavolsag(p3));

        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(15);
        }

        for (Pont p: pontok) {
            System.out.println(p);
        }
        int legtavolabbIndex = 0;
        for (int i = 0; i < pontok.length; i++) {
            if (pontok[legtavolabbIndex].getTavolsagAzOrigotol() <
            pontok[i].getTavolsagAzOrigotol()) {
                legtavolabbIndex = i;
            }
        }
        System.out.printf("Az origótól legtávolabb a(z) %d áll." +
                " A pont a(z): %s távolsága az origótól: %.3f",(legtavolabbIndex), pontok[legtavolabbIndex]);
    }

}