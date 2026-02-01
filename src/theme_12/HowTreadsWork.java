package theme_12;

public class HowTreadsWork {

    static void main() {
        new MyTread1().start();
        new MyTread2().start();
    }

    private static class MyTread1 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(STR."Hello from MyTread1 \{Thread.currentThread().getName()}!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class MyTread2 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from MyTread2 " + Thread.currentThread().getName() + "!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
