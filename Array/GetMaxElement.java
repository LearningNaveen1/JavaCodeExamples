package Array;

public class GetMaxElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        getMaxElement(arr);
    }

    public static void getMaxElement(int[] arr){
        //Base Case

        // Core Logic
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max Element is " + max);

    }
}
