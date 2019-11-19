package TP2JAVA;

public class Exo1   implements  Runnable{
int val;
    Exo1(int valeur){
    val=valeur;
}
    @Override
    public void run() {
                    if( val==1){
                        while(val<=1000){
                            System.out.println(val+" Thread : "+Thread.currentThread().getName());                            val++;
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                return;
                            }
                        }

                    }
                    else{

                        while(val>0){
                            System.out.println( val+" Thread : "+Thread.currentThread().getName());
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

        Runnable run1= new Exo1(1);
        Runnable run2= new Exo1(1000);
        Thread TA= new Thread(run1,"TA");
        Thread TB= new Thread(run2,"TB");
        TA.start();
        TB.start();

    }

}

