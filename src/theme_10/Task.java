package theme_10;

public class Task {

    public static void main(String[] args) {
        String text = "HELLOWORLD";

        int[] result = countChars(text);
        int[] result2 = countChars2(text);

        int lCount = result['L' - 'A'];
        System.out.println(lCount);

        int oCount = result2['O' - 'A'];
        System.out.println(oCount);
    }

    public static int[] countChars(String text) {
        int[] charCount = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            charCount[letter - 'A']++;
        }
        return charCount;
    }

    public static int[] countChars2(String s) {
        int[] charCount = new int[26];
        char[] charArray = s.toCharArray();

        for (char letter : charArray) {
            charCount[letter - 'A']++;
        }
        return charCount;
    }
}
