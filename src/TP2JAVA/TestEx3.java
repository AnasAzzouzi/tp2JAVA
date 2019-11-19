package TP2JAVA;

public class TestEx3 {

    public static void main(String [] args){
        Valeur myVal= new Valeur(0);
        Runnable job1= new AJob(myVal,1);
        Runnable job2= new AJob(myVal,-1);
       Thread t1= new Thread(job1);
        Thread t2= new Thread(job2);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //while(t1.isAlive() || t2.isAlive() ){}
         System.out.println(myVal.toString());

        //Q4 la valeur doit etre 0
        //Q5





    }
}
