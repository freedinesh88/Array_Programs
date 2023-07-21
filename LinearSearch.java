package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {5,3,8,6,2};
		int ele=0;
		int ind=-1;
		for (int i = 0; i < a.length; i++) {
			if(ele==a[i]) {
				ind=i;
				break;
			}
		}
		if (ind!=-1) {
			System.out.println("elenent present in "+ind+" positon");
		}
		else {
			System.out.println("element not found");
		}

	}

}
