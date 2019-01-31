package predicate01;

import java.util.function.Predicate;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class PredicateExample1 {
    public static void main(String[] args) {

        //Predicate String
        Predicate<String> predicateString = s -> {
            return s.equals("Hello");
        };

        System.out.println(predicateString.test("Hello"));
        System.out.println(predicateString.test("Hello World"));

        //Predicate integer
        Predicate<Integer> predicateInt = i -> {
            return i > 0;
        };

        System.out.println(predicateInt.test(5));
        System.out.println(predicateInt.test(-5));
    }
}