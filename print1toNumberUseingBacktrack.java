import java.util.Scanner;

public class print1toNumberUseingBacktrack {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1toNumber(n,n);
    }
    public static void print1toNumber(int n,int num){
        if(n<1){
            return;
        }
        print1toNumber(n-1, num);
        System.out.println(n);
    }
}
