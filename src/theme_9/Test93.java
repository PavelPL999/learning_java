package theme_9;

public class Test93 {

    public static void main(String[] args) {
        String name = "Petr";
        String surname = "Petroff";
        int age = 40;
        String join = String.join("--", name, surname, String.valueOf(age));
        System.out.println(join);

        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        System.out.println(name);

    }
}
