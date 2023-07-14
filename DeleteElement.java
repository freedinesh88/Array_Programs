package arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 2, 5, 6 };
		int dlt_ele = 2, ind = search(a, dlt_ele);
		int arr[] = new int[a.length - 1];
		if (a.length == 0) {
			System.out.println("array is empty");
		} else if (ind == -1) {
			System.out.println("deletion is not possible");
		} else {
			int index = 0;
			for (int i = 0; i < a.length; i++) {
				if (i != ind) {
					arr[index++] = a[i];
				}
			}
			for (int i : arr) {
				System.out.print(i + " ");
			}
		}

	}

	public static int search(int[] a, int ele) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				return i;
			}
		}
		return -1;
	}
}
