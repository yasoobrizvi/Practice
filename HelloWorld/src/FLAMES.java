import java.util.Scanner;

public class FLAMES {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n1=sc.next(), n2=sc.next();
		char arr1[]=n1.toCharArray(), arr2[]=n2.toCharArray();
		sc.close();
		int c=0;
		for(int i=0; i<arr1.length; i++) {
			c=0;
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i]==arr2[j]) {
					arr1[i]=0;
					arr2[j]=0;
					c++;
				}
				if(c==1) break;
			}
		}
		int a=0;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]>= 'a' && arr1[i]<='z') a++;
		}
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]>= 'a' && arr2[i]<='z') a++;
		}
		a=a%6;
		switch(a) {
		case 0 :
			System.out.print("Siblings");
			break;
		case 1 :
			System.out.print("Friends");
			break;
		case 2 :
			System.out.print("Love");
			break;
		case 3 :
			System.out.print("Affection");
			break;
		case 4 :
			System.out.print("Marriage");
			break;
		case 5 :
			System.out.print("Enemy");
			break;
		}
	}
}
