package Sorting;

public class Bubble_Sort {

    public static void main(String[] args) {
        int[] arr = {12,11,13,4,5};

        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        int temp = 0;

        for(int i =0 ; i<len; i++){

            for(int j=0;j<len-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        printArray(arr);

    }

    public static void printArray(int[] arr){
        for (int i=0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
