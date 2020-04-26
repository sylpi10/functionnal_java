package functionnal;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneValid("0688103175"));
        System.out.println(isPhoneValid("1688103175"));
        System.out.println(isPhoneValid("04gfd103175"));

        System.out.println("\nwith predicate");
        System.out.println(isPhoneValidPredicate.test("0688103175"));
        System.out.println(isPhoneValidPredicate.test("1688103175"));
        System.out.println(isPhoneValidPredicate.test("04gfd103175"));
        System.out.println("\nphone valid and contains 3 : ");
        System.out.println(isPhoneValidPredicate.and(contains3).test("0688135478"));
    }

    static boolean isPhoneValid (String phoneNb) {
        return phoneNb.startsWith("06") && phoneNb.length() == 10;
    }

    static Predicate<String> isPhoneValidPredicate = phoneNb ->
            phoneNb.startsWith("06") && phoneNb.length() == 10;

    static Predicate<String> contains3 = phoneNb ->
            phoneNb.contains("3");
}
