package theme_9;

public class ReplaceAllExample {

    public static void main(String[] args) {
        String text = "T.ext wi..th dot.s ";
        String result = text.replaceAll("\\.", "");
        System.out.println(result);

        String res = printUserInfo("Alex", "Rembo", 45);
        System.out.println(res);
    }

    // String Templates
    public static String printUserInfo(String firstName, String lastName, int age) {
        return STR."""
                User information:
                    First name: \{firstName},
                    Last name: \{lastName},
                    Age: \{age}
                """;
    }
}
