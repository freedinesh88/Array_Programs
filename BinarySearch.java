package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {2,4,5,7,9};
		int ele=5;
		int f=0;
		int l=a.length-1;
		int mid=(f+l)/2;
		while(f<=l) {
			if(ele==a[mid]) {
				System.out.println("element is found at "+mid);
				break;
			}
			else if(ele>a[mid]) {
				f=mid+1;
			}
			else if(ele<a[mid]) {
				l=mid-1;
			}
			
			mid=(f+l)/2;
		}
		if(f>l) {
			System.out.println("element not found");
		}

	}

}
