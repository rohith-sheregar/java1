class MyRunnable implements Runnable {
    @Override
    public void run(){
        try{
            Thread.sleep(500);
System.out.println("Thread"+Thread.currentThread().getId()+" is running");
        }
    catch(InterruptedException e){
            e.printStackTrace();
    }
    }
}
public class MainThread_1 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
