package theme_10;

public class VarargsEx {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        findIndexInArray(array);
        findIndexInArray(new int[] {5, 6, 7});

        findIndexInArray2(1, 2, 3);
        findIndexInArray2(5, 6, 7);
    }

    public static int findIndexInArray(int[] values) {
        return values[0];
    }

    public static int findIndexInArray2(int ... values) {
        return values[0] + values[1];
    }
}
