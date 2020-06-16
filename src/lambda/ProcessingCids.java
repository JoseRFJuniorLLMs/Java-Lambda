package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessingCids
{
   public static void main(String[] args)
   {
      // initialize array of Employees
         CidsEntidade[] cids = {
         new CidsEntidade("10000222000456cc454c5465145600028c00000200000"),
         new CidsEntidade("20000222000456cc454c5465145600028c00000200000")
         };

      List<CidsEntidade> list = Arrays.asList(cids);
      ((List) list).parallelStream().forEach(System.out::println);

      System.out.printf("%nUNICO:%n");
      list.parallelStream()
          .map(CidsEntidade::getCdis)
          .distinct()
          .sorted()
          .forEach(System.out::println);

      System.out.printf("%nAGRUPAR:%n");
      Map<String, List<CidsEntidade>> groupedBy =
         list.parallelStream()
             .collect(Collectors.groupingBy(CidsEntidade::getCdis));
      groupedBy.forEach(
         (dep, edep) ->
         {
            System.out.println(dep);
            edep.forEach(
               entidade -> System.out.printf("   %s%n", entidade));
         }
      );
   }
}

