package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(()-> "default value");
        System.out.println(value);

        Object value2 = Optional.ofNullable("hello")
                .orElseThrow(()-> new IllegalStateException("default value"));
        System.out.println(value2  );
    }

}
