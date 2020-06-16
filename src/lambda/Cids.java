package lambda;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class Cids
{
        public static void main(String[] args)
        {

            //ArrayList<String> cdis = new ArrayList<String>();

            String[] cdis = {
                    "10000222000456cc454c5465145600028c00000200000",
                    "20000222000456cc454c5465145600028c00000200000",
                    "30000222000456cc454c5465145600028c00000200000",
                    "40000222000456cc454c5465145600028c00000200000",
                    "50000222000456cc454c5465145600028c00000200000",
                    "10000222000456cc454c5465145600028c00000200000",
                    "20000222000456cc454c5465145600028c00000200000",
                    "30000222000456cc454c5465145600028c00000200000",
                    "40000222000456cc454c5465145600028c00000200000",
                    "50000222000456cc454c5465145600028c00000200000",
                    "10000222000456cc454c5465145600028c00000200000",
                    "20000222000456cc454c5465145600028c00000200000",
                    "30000222000456cc454c5465145600028c00000200000",
                    "40000222000456cc454c5465145600028c00000200000",
                    "50000222000456cc454c5465145600028c00000200000",
                    "10000222000456cc454c5465145600028c00000200000",
                    "20000222000456cc454c5465145600028c00000200000",
                    "30000222000456cc454c5465145600028c00000200000",
                    "40000222000456cc454c5465145600028c00000200000",
                    "50000222000456cc454c5465145600028c00000200000",
            };

            // LER O ARRAY JOGA EM UM STREAM E PRINTA FILTRANDO TRANSFORMANDO PARA BINARIO ETC.

            // display original values
            System.out.printf("CIDS ORIGINAIS: %s%n", Arrays.asList(cdis));

            // sort values in ascending order with streams
            System.out.printf("Sorted CIDS: %s%n",
                    Arrays.stream(cdis)
                            .distinct()
                            .sorted()
                            //.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                            //.map(String::toUpperCase)
                            .collect(Collectors.toList()));



        }
}
