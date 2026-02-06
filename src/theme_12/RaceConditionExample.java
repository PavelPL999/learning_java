package theme_12;

public class RaceConditionExample {
    
    static int counter = 0;
    
    static void main() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter++;
            }    
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter++;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected: 20000");
        System.out.println("Actual: " + counter);
    }
}
