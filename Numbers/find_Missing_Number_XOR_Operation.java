package Numbers;

public class find_Missing_Number_XOR_Operation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};

        check_XOR_Operation(arr);
    }

    public static void check_XOR_Operation(int[] arr){
        int len = arr.length;
        int x1 = arr[0];
        int x2 = 1;

        for(int i=1; i<=len-1;i++)
            x1 = x1^arr[i];

        for(int i=2; i<=len+1;i++)
            x2 = x2^i;

        System.out.println(x1 ^ x2);
    }
}

