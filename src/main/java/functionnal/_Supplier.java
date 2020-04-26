package functionnal;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getConnectionUrl());
        System.out.println(getDbConnectionSupplier.get());
        System.out.println(getDbConnectionSuppliers.get());


    }

    static String getConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDbConnectionSupplier = ()-> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDbConnectionSuppliers = ()
            -> List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer");
}
