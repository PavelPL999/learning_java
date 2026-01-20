package theme_9;

public class UnicodeExample {

    public static void main(String[] args) {
        char symbolD = '\u0044'; // 68, U+0044
        System.out.println(symbolD);

        int d = '\u0044';
        System.out.println(d); // 68
        System.out.println((int) '\u0044');

        // U+1F921
        // System.out.println('\u1F921');

        // Surrogate Pair Calculator etc
        // Суррогатная пара для U+1F921: 0xD83E 0xDD21
       // "\uD83E\uDD21";
        System.out.println("\uD83E\uDD21");

    }
}
