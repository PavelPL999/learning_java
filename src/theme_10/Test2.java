package theme_10;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For exit enter q or exit");

        int number = 0;

        while (true) {
            System.out.println(number);
            String input = scanner.nextLine();
            if (input.equals("q") || input.equals("exit")) {
                break;
            }
            number++;
        }
    }
}
