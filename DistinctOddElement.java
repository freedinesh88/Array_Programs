package arrays;

public class DistinctOddElement {

	public static void main(String[] args) {
		int a[] = {5,6,2,1,2,5,7,9,6,4};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				count++;
			}
		}
		int odd[] = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				odd[j++] = a[i];
			}
		}
		
		for (int i = 0; i < odd.length; i++) {
			int c = 1;
			for (int k = i + 1; k < odd.length; k++) {
				if (odd[i] == odd[k]) {
					c++;
					break;
				} 
			}

			if (c == 1) {
				System.out.println(odd[i]);
			}
		}
	}
}
