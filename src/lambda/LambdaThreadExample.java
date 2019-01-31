package lambda;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class LambdaThreadExample {
    public static void main(String[] args) {

        // Implementing Runnable using anonymous class (Old way)
        Runnable runnable1 = new Runnable() {
            @Override
            public void run()
            {
                System.out.println("Thread name : " + Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable1);

        // Implementing Runnable using Lambda expression
        Runnable runnable2 = () -> {
            System.out.println("Thread name : " + Thread.currentThread().getName());
        };
        Thread thread2 = new Thread(runnable2);

        // Start Threads
        thread1.start();
        thread2.start();
    }
}