package predicate8;

import java.util.function.Predicate;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<String> predicate=s->{
            return s.equals("Hello");
        };

        //AND logical operation
        Predicate<String> predicateAnd = predicate.and( s -> s.length() > 4);
        System.out.println(predicateAnd.test("Hello"));

        //OR logical operation
        Predicate<String> predicateOr=predicate.or( s -> s.length() == 10);
        System.out.println(predicateOr.test("Hello"));

        //NEGATE logical operation
        Predicate<String> predicateNegate=predicate.negate();
        System.out.println(predicateNegate.test("Hello"));
    }
}