package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {12,11,13,5,3,4};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr){
        int len = arr.length;

        for(int i=1; i<len; i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr){
        int len = arr.length;

        for(int i=0; i<len;i++){
            System.out.println(arr[i]);
        }


    }
}
