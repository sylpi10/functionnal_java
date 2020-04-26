package functionnal;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        System.out.println(increment(4));

        System.out.println(incrementByOne.apply(22) );

        System.out.println(multiply.apply(22) );

    }

   static Function<Integer, Integer> incrementByOne = number -> number + 100;

    static int num = 24;
   static Function<Integer, Integer> multiply = number -> number * num;

    static int increment(int number) {
        return number+1;
    }
}
