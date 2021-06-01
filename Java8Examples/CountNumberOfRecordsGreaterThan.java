package Java8Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountNumberOfRecordsGreaterThan {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.stream(arr).filter(s-> (s%3) ==0).count());

        //Reducing the stream
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr1).reduce((s1,s2) -> s1+s2).getAsInt());
    }
}
