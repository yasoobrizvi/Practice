import java.util.Scanner;

public class AdditionusinRecursion {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(Add(n));
	}
	public static int Add(int n) {
		if(n==1) return 1;
		int a=Add(n-1);
		return a+n;
	}
}