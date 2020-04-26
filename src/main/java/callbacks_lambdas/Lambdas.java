package callbacks_lambdas;

import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperName = name -> {

            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(name);
            return name.toUpperCase();
        };

        System.out.println(upperName.apply("Alex"));
    }


}
