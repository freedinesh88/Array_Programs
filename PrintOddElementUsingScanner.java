package arrays;

import java.util.Scanner;

public class PrintOddElementUsingScanner {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] odd=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element "+(i+1)+" :");
			odd[i]=sc.nextInt();
		}
		System.out.print("odd element : [");
		for(int b:odd) {
			if(b%2==1) {
				System.out.print(b+" ");
				
			}
		}
		System.out.println(" ]");
	}

}
