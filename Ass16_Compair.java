package Assignment;

import java.util.Scanner;

public class Ass16_Compair {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String 1 :-");
		String s1 = sc.nextLine();
		
		System.out.println(" ");
		
		System.out.print("Enter String 2 :-");
		String s2 = sc.nextLine();
		
		System.out.println("");
		
		int c=s1.compareTo(s2);
		
		if(c == 0)
		{
			System.out.print("Both String Are Same");
		}
		else
		{
			System.out.print("Both String Are Not Same");
		}
		}
	}
	

