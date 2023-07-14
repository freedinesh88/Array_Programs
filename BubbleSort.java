package arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {8,3,7,6,1,-1,0,5};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("{");
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1) {
			System.out.print(a[i]+",");
			}
			else {
				System.out.print(a[i]);
			}
		}
		System.out.print("}");
	}

}
