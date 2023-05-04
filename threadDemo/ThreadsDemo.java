package threadDemo;


class ThreadOne extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Alan Thread 1");
        }
    }
}

class ThreadTwo extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Sagar Thread 2");
        }
    }
}
public class ThreadsDemo {
 public static void main(String[] args) {
    ThreadOne t1 = new ThreadOne();
    ThreadTwo t2 = new ThreadTwo();

    // t2.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
 }   
}
