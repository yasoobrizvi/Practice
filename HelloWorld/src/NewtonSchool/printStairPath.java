package NewtonSchool;

import java.util.Scanner;

public class printStairPath {
	
public static int countStairPath(int n) {
		
		if(n<0) return 0;
		if(n==0) return 1;
		
		int a = countStairPath(n-1);
		int b = countStairPath(n-2);
		int c = countStairPath(n-3);
		return a+b+c;
	}
	
	public static void stairPathPrint(String psf, int n) {
		
		if(n<0) return;
		
		if(n==0) {
			
			System.out.println(psf);
			return;
		}
		
		stairPathPrint(psf + "1", n-1);
		stairPathPrint(psf + "2", n-2);
		stairPathPrint(psf + "3", n-3);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		System.out.println(countStairPath(N));
		stairPathPrint("", N);
	}

}
