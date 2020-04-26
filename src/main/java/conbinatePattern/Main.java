package conbinatePattern;

import java.time.LocalDate;

import static conbinatePattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "Alice@mail.en",
                "+3345784698",
                LocalDate.of(1994, 04, 22)
        );

        Customer customer2 = new Customer(
                "John",
                "JOhn@mail.en",
                "+00000000",
                LocalDate.of(2010, 04, 22)
        );
        Customer customer3 = new Customer(
                "John",
                "JOhn@mail.en",
                "+330000000",
                LocalDate.of(2010, 04, 22)
        );

        // with CustomerValidatorService => no way to see where error may come from
        System.out.println(new CustomerValidatorService().isValid(customer));



        // with  CustomerRegistrationValidator :

//        CustomerRegistrationValidator
//                .isEmailValid()
//                .and(CustomerRegistrationValidator.isPhonelValid()
//                .and(CustomerRegistrationValidator.isAdult()));

        System.out.println(isEmailValid()
                .and(isPhonelValid()
                .and(isAdult()))
                .apply(customer));

        System.out.println(isEmailValid()
                .and(isPhonelValid()
                .and(isAdult()))
                .apply(customer2));

        System.out.println(isEmailValid()
                .and(isPhonelValid()
                .and(isAdult()))
                .apply(customer3));
    }
}
