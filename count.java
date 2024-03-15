public class count
{
	public static void main(String[] args) {
		System.out.println("Hello World!");
        int ans=count1(1);
        System.out.println("My ans is --> "+ans);
	}
    public static int count1(int n) {
        if (n == 4) {
            return n;
        } else {
            System.out.println(n);
            n++; 
        }
        return count1(n);
    }
}

