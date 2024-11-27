class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread:" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Interupted");
            }
        }
    }
}


public class MainThread {
    public static void main(String[] args) {
        MyThread myThread =new MyThread("ChildThread");
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread:"+i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(" Main Thread is Interupted");
            }

            }
        }

    }