package theme_10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysEx1 {

    public static void main(String[] args) {
        String[] textArray = new String[5];
        textArray[0] = "Hello";
        textArray[1] = "Buy";
        textArray[2] = "Friend";
        textArray[3] = "Java";
        textArray[4] = "Like";

        String[] names = {"Petr", "Ivan", "Bill"};
        System.out.println(names[0]);
        System.out.println(Arrays.toString(names));

        int[] numbers = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        int[] numbers2 = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println((double) sum / numbers.length);

        double result = Arrays.stream(numbers2).average().orElse(-1);
        System.out.println(result);

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
