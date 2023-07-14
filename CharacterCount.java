package arrays;

import java.util.Scanner;

public class CharacterCount {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		char[] character=new char[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the char "+(i+1)+ " :");
			character[i]=sc.next().charAt(0);
		}
		int noOfAlpa=0,noOfInt=0,noOfSpec=0;
		for(char ch:character) {
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				noOfAlpa++;
			}
			else if((ch>='0'&&ch<='9')) {
				noOfInt++;
			}
			else {
				noOfSpec++;
			}
		}
		System.out.println("the no of alphabet: "+noOfAlpa);
		System.out.println("the no of integer: "+noOfInt);
		System.out.println("the no of special characte: "+noOfSpec);

	}

}
