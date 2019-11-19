package TP2JAVA;

public class AJob implements Runnable{
    Valeur myVal;
    int i;

    public AJob(Valeur myVal, int i) {
        this.myVal = myVal;
        this.i = i;
    }

    @Override
    public void run() {
        int j=1;
        while(j<= Math.pow(10,6)){
            myVal.add(i);
            /*
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }*/
            j++;
        }
        System.out.println("myVal = "+myVal.getVal()+" Thread : "+Thread.currentThread().getName());

    }
}
