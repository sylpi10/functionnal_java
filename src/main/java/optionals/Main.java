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

        String email = "JohnDoe@mail";
        Optional.ofNullable(email)
                .ifPresentOrElse(
                        mail -> System.out.println("Sending mail to " + mail),
                        () -> System.out.println("Cannot send mail")
                );
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        mail -> System.out.println("Sending mail to " + mail),
                        () -> System.out.println("Cannot send mail")
                );
    }

}
