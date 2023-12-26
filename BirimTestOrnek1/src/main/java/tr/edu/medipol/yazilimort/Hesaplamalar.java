package tr.edu.medipol.yazilimort;

public class Hesaplamalar {

    public static int faktoriyelRec(int n) {
        if(n == 1) return 1;
        return n * faktoriyelRec (n-1);
        }

    public static int faktoriyelLoop(int n) {
        int sonuc = 1;
        for(int i=n; i>1; i--){
        sonuc = sonuc * i;
    }
    return sonuc;

    }
    public static int topla(int a, int b) {
        int sonuc = a + b;
        return sonuc;
    }

    public static int cikart(int a, int b) {
        int sonuc = a - b;
        return sonuc;
    }

    public static int carp(int a, int b) {
        int sonuc = a * b;
        return sonuc;
    }
}