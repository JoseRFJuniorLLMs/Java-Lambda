package ex8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class ArraysAndStreams {

        public static void main(String[] args)
        {
            int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
            String[] strings = {"Maria", "Marcos", "Mario", "MARIA", "MARCOS", "marina", "Marina"};

            List<String> Teste = Arrays.stream(strings)
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.printf("Original strings: %s%n", Arrays.asList(Teste));

            List<String> Teste2 = Arrays.stream(strings)
                    .filter(s -> s.compareToIgnoreCase("n") < 0)
//                  .sorted(String.CASE_INSENSITIVE_ORDER)
                    .sorted(String::compareToIgnoreCase)
                    .collect(Collectors.toList());
            System.out.printf("Original strings: %s%n", Arrays.asList(Teste2));

            List<String> Teste3 = Arrays.stream(strings)
                    .filter(s -> s.equals("MARIA"))
                    .sorted(String::compareToIgnoreCase)
                    .collect(Collectors.toList());
            System.out.printf("Original strings: %s%n", Arrays.asList(Teste3));

            List<String> Teste4 = Arrays.stream(strings)
                    .filter(s -> s.equals("Maria"))
                    .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                    .collect(Collectors.toList());
            System.out.printf("Original strings: %s%n", Arrays.asList(Teste4));

        }
    }



