import java.util.Scanner;

public class sumOfFirstNnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + result);
    }
    public static int sum(int n){
        if (n == 0) {
            return 0;
        }
            return n+sum(n-1);
    }
}
