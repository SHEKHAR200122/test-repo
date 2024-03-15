import java.util.Scanner;

public class printNameNtimes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many times you want to print Youre Name -> ");
        int n=scanner.nextInt();
        printNameNtimes(1,n);

    }
    public static void printNameNtimes(int n,int num){
           if (n>num) {
               return;
           }
           else{
               System.out.println("Youre Name-->Barnali");
               printNameNtimes(n+1,num);
           }
    }
}
