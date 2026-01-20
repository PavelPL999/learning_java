package theme_9;

// 9.5 Знакомство с классом StringBuilder (изменяемые строки)

public class Test95 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append('!');
        sb.append(77);

        System.out.println(sb);

        String string = sb.toString();
        System.out.println(string);

        sb.reverse();
        System.out.println(sb);
    }
}
