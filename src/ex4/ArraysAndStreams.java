package ex4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class ArraysAndStreams
{
   public static void main(String[] args)
   {
      Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6, 6};
      String[] cdis = {
                       "10000222000456cc454c5465145600028c00000200000",
                       "20000222000456cc454c5465145600028c00000200000",
                       "30000222000456cc454c5465145600028c00000200000",
                       "40000222000456cc454c5465145600028c00000200000",
                       };


      // display original values
      System.out.printf("CIDS ORIGINAIS: %s%n", Arrays.asList(cdis));

      // sort values in ascending order with streams
      System.out.printf("Sorted CIDS: %s%n",
              Arrays.stream(cdis)
                      //.distinct()
                      .sorted()
                      .collect(Collectors.toList()));


      // display original values
      System.out.printf("Original values: %s%n", Arrays.asList(values));

      // sort values in ascending order with streams
      System.out.printf("Sorted values: %s%n", 
         Arrays.stream(values)
//               .distinct()
               .sorted()
               .collect(Collectors.toList()));

      // values greater than 4
      List<Integer> greaterThan4 =
         Arrays.stream(values)
               .filter(value -> value > 4)
               .collect(Collectors.toList());
      System.out.printf("Values greater than 4: %s%n", greaterThan4);

      // filter values greater than 4 then sort the results
      System.out.printf("Sorted values greater than 4: %s%n",
         Arrays.stream(values)
               .filter(value -> value > 4)
               .sorted()
               .collect(Collectors.toList()));

      // greaterThan4 List sorted with streams
      System.out.printf(
         "Values greater than 4 (ascending with streams): %s%n",
         greaterThan4.stream()
               .sorted()
               .collect(Collectors.toList()));
   }
} // end class ArraysAndStreams
