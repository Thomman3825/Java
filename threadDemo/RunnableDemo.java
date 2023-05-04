package threadDemo;

//DEADLOCK
class Deadlock{
    static int initialVal = 0;
    public void deadLock(){
        Runnable r1 = ()->{
            for (int i = 0;i<5;i++){
                initialVal+=1;
                //  System.out.println(initialVal);
            }
        };
        Runnable r2 = ()->{
            for (int i = 0;i<5;i++){
                initialVal+=1;
            }
            System.out.println(initialVal);
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // try {
        //     t2.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
            t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        // RunnableDemo jj=new RunnableDemo();
        System.out.println(initialVal + "main");
    }
}

public class RunnableDemo{
    

    
    public static void main(String[] args) {
        Deadlock d1 = new Deadlock();
        d1.deadLock();
    }
}
