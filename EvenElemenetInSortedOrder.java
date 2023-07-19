package arrays;

public class EvenElemenetInSortedOrder {

	public static void main(String[] args) {
		int a[]= {2,7,10,8,3,5,4,9,6};
		int evennum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evennum++;
			}
		}
		int even[]=new int[evennum];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[j++]=a[i];
			}
		}
		int max;
		for(int i=0;i<even.length;i++) {
			for(int k=i+1;k<even.length;k++) {
				if(even[i]>even[k]) {
					max=even[i];
					even[i]=even[k];
					even[k]=max;
				}
			}
		}
		for(int i=0;i<even.length;i++) {
			System.out.print(even[i]+" ");
		}

	}

}
