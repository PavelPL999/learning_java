package theme_12;

import java.util.HashMap;
import java.util.Map;

public class IteratedOverHashMap {

    static void main() {
        Map<Long, String> productById = createHashMap();
        for (Map.Entry<Long, String> product : productById.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    private static Map<Long, String> createHashMap() {
        Map<Long, String> productById = new HashMap<>();
        productById.put(1L, "Laptop");
        productById.put(2L, "Smartphone");
        productById.put(3L, "Smart Watch");
        productById.put(4L, "Headphones");
        return productById;
    }
}
