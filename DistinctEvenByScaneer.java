package arrays;

import java.util.Scanner;

public class DistinctEvenByScaneer {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
			
		}
		int dis[] = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				dis[j++] = a[i];
			}
			
		}
		for (int i = 0; i < dis.length; i++) {
			int c = 1;
			for (int k = i + 1; k < dis.length; k++) {
				if (dis[i] == dis[k]) {
					c++;
					break;
				} 
			}

			if (c == 1) {
				System.out.println(dis[i]);
			}
		}
	}


}
