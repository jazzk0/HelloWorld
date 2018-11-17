package main;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        List<String> str = new ArrayList<String>();
        List<Integer> ints = new ArrayList<Integer>();

        str.add("Jas");
        str.add("Tom");
        str.add("John");
        str.add("Kai");
        str.add("Katy");

        ints.add(4);
        ints.add(5);
        ints.add(23);
        ints.add(34);
        ints.add(42);

        Predicate<String> s = (st) -> st.equals("Jas");
        Predicate<Integer> i = in -> (in == 5);
        Predicate<Integer> notFound = j -> (j == 99);

        System.out.println(linearSearch(str, s));
        System.out.println(linearSearch(ints, i));
        System.out.println(linearSearch(ints, notFound));
    }

    public static <T> int linearSearch(List<T> list, Predicate<T> check)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(check.test(list.get(i)))
            {
                return i;
            }
        }
        return -1;
    }
}
