package theme_12;

import java.util.Optional;

// 12.3 Знакомство с классом Optional

public class OptionalExample {

    static void main() {
        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);

        if (!optionalName.isEmpty()) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("not valid name");
        }

        Optional.ofNullable(name).ifPresent(System.out::println);

        Optional.ofNullable(name).ifPresentOrElse(System.out::println, () -> System.out.println("exception"));

        String result = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("unknown");
        System.out.println(result);
    }
}
