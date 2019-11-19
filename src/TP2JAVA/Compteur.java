package TP2JAVA;

public class Compteur extends Thread{
    String nom;
    int maxValue;

    public Compteur(String nom, int maxValue) {
        this.nom = nom;
        this.maxValue = maxValue;

    }
    public void run() {
        long random_number=Math.round(Math.random()*2000);
        int val=1;
            while(val<=maxValue){
                System.out.println(val+" Thread : "+getName());
                val++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
            System.out.println(random_number);

        }
    }

