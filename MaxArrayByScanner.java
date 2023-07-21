package arrays;

import java.util.Scanner;

public class MaxArrayByScanner {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("The maximum elmenet is :"+max);
	}

}
