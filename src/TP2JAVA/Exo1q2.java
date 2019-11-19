package TP2JAVA;

public class Exo1q2 extends Thread{
    int val;
    Exo1q2(int valeur){
        val=valeur;
    }
    public void run() {
        if( val==1){
            while(val<=1000){
                System.out.println(val+" Thread : "+getName());
                val++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }

        }
        else{

            while(val>0){
                System.out.println( val+" Thread : "+getName());
                val--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

    }
    public static void main(String [] args){

       new Exo1q2(1).start();
       new Exo1q2(1000).start();


    }
}
