package theme_12;

import java.util.HashSet;
import java.util.Set;

public class SetIntro {

    public static void main(String[] args) {
        Set<String> products = new HashSet<>();
        products.add("Laptop");
        products.add("TV");
        products.add("Smartphone");
        products.add("Headphone");

        for (String product : products) {
            System.out.println(product);
        }

        System.out.println(products);
        System.out.println(products.contains("Laptop"));
    }
}
