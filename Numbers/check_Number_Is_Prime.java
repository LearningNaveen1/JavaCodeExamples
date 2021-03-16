package Numbers;

import java.util.Scanner;

// This program is to check whether number is prime or not
public class check_Number_Is_Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        int remainder = 0;

        //Basic check for valid number
        if((number <=1) || number == null)
            System.out.println("Not a valid entry");
        if((number == 2) || (number == 3)){
            System.out.println(number + " is a prime number");
        }
        else{
            for (int i=2; i<number / 2; i++){
                remainder = number%i;
                if(remainder == 0){
                    System.out.println(number + " is not prime");
                    System.exit(1);
                }
            }
            System.out.println(number + " is a prime number");
        }


    }
}


