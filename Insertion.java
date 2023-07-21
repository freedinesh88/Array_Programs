package arrays;
import java.util.Scanner;

public class Insertion {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int a[]= new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elemnt "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element that you want to enter:");
		int ele=sc.nextInt();
		System.out.println("Enter the positin that you want to enter:");
		int pos=sc.nextInt();
		int arr[]=new int[a.length+1];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(pos<1||pos>a.length+1) {
				System.out.println("can not be inserted");
				break;
			}
			if(i==pos-1) {
				arr[i]=ele;
				
			}
			else {
				arr[i]=a[index++];
			}
		}
		System.out.println("after insertion the new array : ");
		for (int i : arr) {
			if(pos<1||pos>a.length+1) {
				break;
			}
			System.out.print(i+" ");
		}

	}

}
