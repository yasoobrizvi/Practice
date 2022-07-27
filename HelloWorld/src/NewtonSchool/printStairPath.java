package NewtonSchool;

import java.util.Scanner;

public class printStairPath {
	
public static int countStairPath(int stair[][], int n) {
		
		if(n<0) return 0;
		if(n==0) return 1;
		
		int a = countStairPath(stair, n-1);
		int b = countStairPath(stair, n-2);
		int c = countStairPath(stair, n-3);
		return a+b+c;
	}
	
	public static void stairPathPrint(int stair[][], String psf, int n) {
		
		if(n<0) return;
		
		if(n==0) {
			
			System.out.println(psf);
			return;
		}
		
		stairPathPrint(stair, psf + "1", n-1);
		stairPathPrint(stair, psf + "2", n-2);
		stairPathPrint(stair, psf + "3", n-3);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int stair[][]=new int[0][N];
		sc.close();
		System.out.println(countStairPath(stair, N));
		stairPathPrint(stair, "", N);
	}

}
