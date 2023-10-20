package assignment;

import java.util.Scanner;

public class Question2 {
	//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next().toUpperCase();
		
		char[] ch=s.toCharArray();
		int ans=0;
		for (int i = 0; i < ch.length; i++) {
			if(i<ch.length-1 && (ch[i]<ch[i+1])) {
					ans-=romanToInt(ch[i]);
			}
			else {
				ans+=romanToInt(ch[i]);
			}
		}
		
		System.out.println(ans);
		
	}
	
	public static int romanToInt(char c) {
		switch (c) {
		case 'I':{return 1;}
		case 'V':{return 5;}
		case 'X':{return 10;}
		case 'L':{return 50;}
		case 'C':{return 100;}
		case 'D':{return 500;}
		case 'M':{return 1000;}
		}
		return 0;
	}

}
