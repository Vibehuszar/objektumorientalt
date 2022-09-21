package hu.petrik.oopalapok.feladat2;

public class Kor {

    private int x;
    private int y;
    private int r;

    private int r2;

    public Kor(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Kor(int n){
        this.x = randomGeneralas(n);
        this.y = randomGeneralas(n);
        this.r = randomGeneralas(n);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }

    private static int randomGeneralas(int n){return (int) (Math.random() * (2 * n + 1)) - n;}

    public double kerulet(){
        return 2*Math.abs(r)*Math.PI;}
    public double terulet(){
        return Math.pow(r, 2)*Math.PI;
    }
    

    @Override
    public String toString(){
        return String.format("(%d,%d,%d)",this.x,this.y,this.r);
    }



}
