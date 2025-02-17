//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        try {
            thread1.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MyThread thread2 = new MyThread();
        thread2.start();
        try {
            thread2.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread extends Thread {
    public void run(){
        for (int i=0;i<1000;i++){
            try {
                Thread.sleep(3);
                System.out.println("This is your thread " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}