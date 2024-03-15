import java.util.Scanner;
public class factorialNnaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
            
        }
    }
}
