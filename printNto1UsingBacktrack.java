import java.util.Scanner;

public class printNto1UsingBacktrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        printNto1(n,n);
    }
    public static void printNto1(int n,int num){
        if(n<1){
            return;
        }
        else{
            System.out.println(n);
            printNto1(n-1,num);

        }
        }
}
