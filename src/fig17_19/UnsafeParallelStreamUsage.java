package fig17_19;

import java.util.stream.LongStream;

public class UnsafeParallelStreamUsage {

    private static long total = 0;

    public static void main (String... args) {

         LongStream.range(0,1_000_000_000)

        .parallel()
        .filter(x -> x % 2 == 0)
        .forEach(n -> total += n);

        System.out.println(total);
    }
}
