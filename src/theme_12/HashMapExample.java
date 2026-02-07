package theme_12;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    static void main() {
        String id1 = "123abc";
        String name1 = "Alex";
        String id2 = "456def";
        String name2 = "Olga";
        String id3 = "789hij";
        String name3 = "John";

        Map<String, String> nameById = new HashMap<>();
        nameById.put(id1, name1);
        nameById.put(id2, name2);
        nameById.put(id3, name3);

        String result = nameById.get(id2);
        System.out.println(result);
    }
}
