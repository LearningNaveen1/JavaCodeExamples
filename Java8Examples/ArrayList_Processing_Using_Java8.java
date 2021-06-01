package Java8Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_Processing_Using_Java8 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("naveen");
        list.add("suyash");
        list.add("mudit");
        list.add("ishant");
        list.add("sameer");

        /*
        List of operations performed:
            a. Printing list of elements starting with 's'
            b. Provide a sorted list in new arraylist
            c. Printing the new list
            d. checking count of words starting with 's'

         */

        //a.
        list.stream().filter(s->s.startsWith("s")).forEach(System.out::println);

        //b.
        List<String> newList = list.stream().sorted().collect(Collectors.toList());

        //c.
        newList.stream().forEach(System.out::println);

        //d.
        int temp = (int) list.stream().filter(s->s.startsWith("s")).count();
        System.out.println(temp);

    }
}
