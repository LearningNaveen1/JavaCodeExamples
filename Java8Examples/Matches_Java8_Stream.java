package Java8Examples;

import java.util.ArrayList;

public class Matches_Java8_Stream {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("naveen");
        list.add("suyash");
        list.add("mudit");
        list.add("ishant");
        list.add("sameer");

        /*
            a. anymatch for a particular pattern
            b. allmatch - checking all strings throuhg a pattern
            c. nonematch - checking none of them is matching
         */

        //a.
        System.out.println(list.stream().anyMatch(s->s.startsWith("n")));

        //b.
        System.out.println(list.stream().allMatch(s->s.startsWith("s")));

        //c.
        System.out.println(list.stream().noneMatch(s->s.startsWith("z")));
    }
}
