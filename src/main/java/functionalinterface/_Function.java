package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
    int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        int chained = addBy1ThenMultiplyBy10.apply(increment);
        System.out.println(chained);

        // BiFunction takes 2 arguments and produces 1 result
        int biNormal = incrementByOneAndMultiply(4,100);
        System.out.println(biNormal);

        int biNormal2 = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println(biNormal2);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer, Integer> addBy1ThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

    static int incrementByOne(int numberOne){
        return  numberOne + 1;
    }

    // Bi function section

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberOne, numberTwo) -> (numberOne + 1) * numberTwo;
    static int incrementByOneAndMultiply(int numberOne, int numberTwo){
        return  (numberOne + 1) * numberTwo;
    }
}
