package NewtonSchool;

import java.util.Scanner;

public class rootsOfEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        sc.close();
        float d=(b*b)-(4*a*c);  //determinant
        int e=0;
        if(d>0) e=1;
        else if(d<0) e=-1;
        else e=0;
        float r=(-b)/(2*a);  //real part
        float f;
        switch(e) {
            case 1:
            f = (float) (Math.sqrt(Math.abs(d)))/(2*a);
            float r1 = r + f;
            float r2 = r - f;
            System.out.printf("%.2f", r1);
            System.out.println();
            System.out.printf("%.2f", r2);
            break;
            case -1:
            f = (float) (Math.sqrt(Math.abs(d)))/(2*a);
            String s1=String.format("%.2f", r);
            String s2=String.format("%.2f", f);
            System.out.printf(s1 + "+i" + s2);
            System.out.println();
            System.out.printf(s1 + "-i" + s2);
            break;
            default:
            f = (float) (Math.sqrt(d))/(2*a);
            System.out.printf("%.2f", r);
            break;
        }
	}

}
