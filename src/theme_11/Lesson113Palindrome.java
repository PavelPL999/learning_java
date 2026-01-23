package theme_11;

public class Lesson113Palindrome {

    public boolean isPalindrome(int number) {
        boolean result = false;
        if (number < 0) {
            return result;
        }

        int temp = number;
        int reversed = 0;

        while (temp != 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            reversed = reversed * 10 + lastDigit;
        }
        return number == reversed;
    }
}
