import java.util.Scanner;

public class CheckForPerfectSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Is this " + num + " a perfect square ? ");
        System.out.println(checkForSquare(num));
    }

    public static boolean checkForSquare(int n) {
        //Base Conditions
        if (n <= 1 ||  n >= 100){
            System.out.println("Incorrect Value");
            return false;
        }
        //Actual Logic
        for(int i=1; i<=n ; i++){
            if((n%i ==0) && (n/i == i)){
                return true;
            }
        }
        return false;

    }
}
