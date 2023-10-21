package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
	//Check if the input is pangram or not.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine().toUpperCase();
		
		System.out.println(isPangram(s));
		
	}
	
	public static String isPangram(String s) {
		boolean[] present=new boolean[26];
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				int pos=s.charAt(i)-'A';
				present[pos]=true;
			}
		}
		
		for(boolean i:present) {
			if(i!=true) {
				return "It is not a Pangram";
			}
		}
		return "It is a Pangram";
	}
}
