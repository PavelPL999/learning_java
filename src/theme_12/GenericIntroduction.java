package theme_12;


public class GenericIntroduction {

    static void main() {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("One", 0);
        stringStorage.add("Two", 1);
        stringStorage.add("Three", 2);
        stringStorage.add("Four", 3);

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.add(1, 0);
        integerStorage.add(2, 1);
        integerStorage.add(3, 2);
        integerStorage.add(4, 3);
    }
}

class Storage<T> {

    private Object[] items = new Object[100];

    public void add(T item, int index) {
        items[index] = item;
    }
}
