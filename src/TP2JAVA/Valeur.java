package TP2JAVA;

public class Valeur {
    int val;

    public Valeur(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Valeur : "+val ;
    }
    public synchronized void add(int i){
        val+=i;
    }
}
