package NewtonSchool;

import java.util.Scanner;

public class sarAndMonsters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int j=1;
        for(int i=1; i<n; i++) {
            arr[i]=arr[i]-j;
            if(arr[i]<=0) {
                System.out.print(i+1);
                break;
            }
            j++;
            if(i==(n-1)) i=-1;
        }
//		 int i=1;
//         int j=1;
//         int res = 0;
//         while(true){
//             arr[i%n] = arr[i%n]-j;
//             if(arr[i%n]<=0){
//                 res = i%n+1;
//                 break;
//             }
//             i++;
//             j++;
//         }
//         System.out.println(res);

	}

}
