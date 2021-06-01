package Java8Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArraOfString_t0_StringStream {
        public static void main(String[] args) {

            List<String> strList = new ArrayList<String>();
            strList.add("100");
            strList.add("200");
            strList.add("300");
            strList.add("400");
            strList.add("500");

            // Converting List of integer to Stream Integer and print it.
            Stream<String> stream = strList.stream();

            //Printing the stream of integer
            stream.forEach(System.out::println);


        }
    }

