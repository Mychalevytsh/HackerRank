package forTest;

import java.util.Scanner;

public class Test {
    public static void main (String[] args)throws InterruptedException {
       MyTread myThread = new MyTread();
       myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyTread extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Hello!");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
    public  void shutdown(){
        this.running = false;
    }
}
