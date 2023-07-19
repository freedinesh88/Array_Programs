package arrays;

public class DuplicatePrimeElement {
public static void main(String[] args) {
	int a[]= {5,6,2,1,2,5,7,9,6,4};
	int count=0;
	for(int i=0;i<a.length;i++) {
		int c=0;
		int n=a[i];
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				c++;
			}
		}
		if(c==2) {
			count++;
		}
		
	}
	int prm[]=new int[count];
	int k=0;
	for(int i=0;i<a.length;i++) {
		int c=0;
		int n=a[i];
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				c++;
			}
		}
		if(c==2) {
			prm[k++]=a[i];
		}
		
	}
	for(int i=0;i<prm.length;i++) {
		int c=1;
		for(int j=i+1;j<prm.length;j++) {
			if(prm[i]==prm[j]) {
				c++;
				prm[j]=1;
				
				
			}
		}
		if(c>1 && prm[i]!=1) {
			System.out.println(prm[i]);
		}
	
}
}
}

