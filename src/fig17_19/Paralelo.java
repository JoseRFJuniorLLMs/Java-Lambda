package fig17_19;

import java.util.stream.LongStream;

public class Paralelo {

    public static void main(String[] args) {

        long sum2 = LongStream.range(0, 9_00_00_00)
                .parallel()
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("IMPRIMINDO COM PARALELO");
        System.out.println(sum2);

    }
}
