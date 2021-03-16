package Numbers;

/*
    Program - to find missing number in sequential array
 */

public class find_Missing_Number_In_Array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6};
        System.out.println("Missing number is : " + getMissingNumber(arr));
    }

    public static int getMissingNumber(int[] arr){
        int len = arr.length ;
        int total = (len+1) * (len+2) /2 ;
        int sum = 0;
        for (int i=0;i<len;i++){
            sum += arr[i];
        }

        return total - sum ;
    }
}
