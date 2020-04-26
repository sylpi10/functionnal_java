package functionnal;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer miss = new Customer("Miss C", "0645258471");
        Customer mister = new Customer("Mister N", "0657582364");

        greetCustomer.accept(miss);
        greetCustomerBi.accept(mister, false);
        greetCustomerBi.accept(mister, true);

    }

    static Consumer<Customer> greetCustomer = customer -> System.out.println("hello " + customer.name + ", your phone is " + customer.phone);
    static BiConsumer<Customer, Boolean> greetCustomerBi = (customer, showPhone)
            -> System.out.println("hello " + customer.name + ", your phone is " + ( showPhone ? customer.phone : "******"));

    static class Customer{

        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}


