import java.util.*;
public class StringToggling {
	public static String ToggleCase(String s) {
		
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				char upperCasechar = (char)(ch - ('a'- 'A'));
				res += upperCasechar;
			} else if(ch >= 'A' && ch <= 'Z') {
				char lowerCasechar = (char)(ch + ('a'- 'A'));
				res += lowerCasechar;
			} else {
				res += ch;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(ToggleCase(s));
		}
	}
