package arrays;

public class LargestNumberForm {

	public static void main(String[] args) {
		int a[]= {1,7,310,5,6};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				String f=a[i]+""+a[j];
				String r=a[j]+""+a[i];
				if(Integer.parseInt(f)<Integer.parseInt(r)) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		String res="";
		for (int i : a) {
			res=i+res;
		}
		System.out.println(res);

	}

}
