package Numbers;

/* This printing technique is using Sieve method.
    Order is  - O(n(log(log(n)))

*/

public class print_All_Prime_Number_Under {
    public static void main(String[] args) {
        checkSieve(100);
    }

    public static void checkSieve(int number){

        //Marking all the prime boolean array as true.
        boolean[] prime = new boolean[number+1];
        for(int i=0; i<=number; i++){
            prime[i] = true;
        }

        //Actual processing
        for(int i=2; i*i <=number; i++ ){
            if(prime[i] == true){
                for(int j=i*i; j<=number; j+=i){
                    prime[j] = false;
                }
            }
        }

        //Printing the prime values
        for(int i=2; i<=number; i++){
            if(prime[i] == true){
                System.out.println(i + " ");
            }
        }
    }
}
