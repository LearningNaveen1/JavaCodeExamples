package Java8Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayOfInteger_to_IntegerStream {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        intList.add(400);
        intList.add(500);

        // Converting List of integer to Stream Integer and print it.
        Stream<Integer> stream = intList.stream();

        //Printing the stream of integer
        stream.forEach(System.out::println);


    }
}
