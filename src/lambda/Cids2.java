package lambda;

import java.util.*;

public class Cids2 {
    public static void main(String[] args)
    {
        ArrayList<String> cids = new ArrayList<String>();

        cids.add("10000222000456cc454c5465145600028c00000200000");
        cids.add("20000222000456cc454c5465145600028c00000200000");
        cids.add("30000222000456cc454c5465145600028c00000200000");
        cids.add("40000222000456cc454c5465145600028c00000200000");

        System.out.println("LISTA CIDS:");
        cids.forEach((n) -> print(n));
    }


    public static void print(String n)
    {
        System.out.println("CIDS:" + n);
    }
}