package threads;


//extends Thread
//implements Runnable

//Status
//NEW
//RUNNABLE;
//RUNNING;
//BLOCKED/WAITING;
//TERMINATED/DEAD;

class Task1 extends Thread {
    public void run() {
        System.out.print("\nTask1 started\n");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        Thread.yield();
        System.out.print("\nTask1 Done\n");
    }
}


class Task2 implements Runnable {
    public void run() {
        System.out.print("\nTask2 started\n");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask2 Done\n");
    }
}

public class ThreadBasicRunner {

    public static void main(String[] args) throws InterruptedException {
        //task 1
        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start(); //not task1.run() - this runs in

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2); //not task1.run() - this runs in
        task2Thread.start();

        //wait for task 1 to complete
        task1.join();
        //wait for task 2 to complete
        task2Thread.join();

        Thread.sleep(1000);

        //task 3
        System.out.print("\nTask3 started\n");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask3 Done\n");


    }


}
