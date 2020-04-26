package callbacks_lambdas;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {

        hello("John", "Patrick", null);

        System.out.println("\n");
        hello("John", null, value -> {
            System.out.println("no lastname provided for " + value);
        });
    }

    static void hello(String firstname, String lastname, Consumer<String> callback) {

        System.out.println(firstname);
        if (lastname != null) {
            System.out.println(lastname);
        }else {
            callback.accept(firstname);
        }
    }
}
