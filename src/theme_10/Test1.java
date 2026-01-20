package theme_10;

public class Test1 {

    public static void main(String[] args) {
        printAllCharactersExcept("Hello worlds", 'l');
    }

    private static void printAllCharactersExcept(String text, char ignoreSymbol) {
        char[] charArray = text.toCharArray();
        for (char character : charArray) {
            if (character == ignoreSymbol) {
                continue;
            }
            System.out.print(STR."\{character} ");
        }
    }
}
