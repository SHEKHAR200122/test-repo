import java.util.Scanner;

public class printNumberNtimes {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        printNumberNtimes(1, num);

    }
    public static void printNumberNtimes(int n, int num) {
        if (num<1) {
            return;
        }
        else {
            System.out.println(num);
            printNumberNtimes(n, num-1);
        }
    }
}

