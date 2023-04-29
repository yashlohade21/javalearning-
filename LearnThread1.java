class ThreadX implements Runnable{
    public void run( ){
        for(int i = 1; i <=5; i++){
            System.out.println("From Thread X With i = " + -1*i);
        }
        System.out.println("Exiting from Thread X ...");
    }
}

class ThreadY implements Runnable{
    public void run( ){
        for(int j = 1; j <=5; j++){
            System.out.println("From Thread Y With i = " + 2*j);
        }
        System.out.println("Exiting from Thread Y ...");
    }
}

class ThreadZ implements Runnable{
    public void run( ){
        for(int k = 1; k <=5; k++){
            System.out.println("From Thread Z With i = " +(2*k-1));
        }
        System.out.println("Exiting from Thread Z ...");
    }
}

public class LearnThread1 {
    public static void main(String args[]){
        ThreadX x = new ThreadX();
        Thread t1 = new Thread(x);

        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);

        ThreadZ z = new ThreadZ();
        Thread t3 = new Thread(z);

        t1.start();
        t2.start();
        t3.start();

        System.out.println(".... Multithreading is over ");
    }
}
