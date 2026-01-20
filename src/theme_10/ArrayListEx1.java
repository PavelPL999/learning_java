package theme_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");

        List<String> immutableNames = List.of("Petr", "Olga", "Zena");

        ArrayList<String> names2 = new ArrayList<>(List.of("Petr", "Olga", "Zena"));

        System.out.println(names2);
        System.out.println(immutableNames);

        names2.add("John");

        System.out.println(names2);

        List<String> list = Arrays.asList("Masha", "Olga", "Zena");
        ArrayList<String> listNames = new ArrayList<>(Arrays.asList("Masha", "Olga", "Zena"));
        System.out.println(list);
        System.out.println(listNames);
    }
}
