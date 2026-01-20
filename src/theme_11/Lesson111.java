package theme_11;

public class Lesson111 {

    public int findNumbers(int[] nums) {
        int numberOfEvenNumbers = 0;

        for (int num : nums) {
            int countOfDigits = 0;
            while (num != 0) {
                num = num / 10;
                countOfDigits++;
            }

            if (countOfDigits % 2 == 0) {
                numberOfEvenNumbers++;
            }
        }

        return numberOfEvenNumbers;
    }
}
