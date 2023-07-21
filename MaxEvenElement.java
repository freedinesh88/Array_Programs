package arrays;

public class MaxEvenElement {
public static void main(String[] args) {
	int []a= {1157,30,20,30,40,100,121};
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			max=a[i];
			break;
		}
	}
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]>max) {
			if(a[i]%2==0) {
				max=a[i];
			}
		}
	}
	System.out.println("The max even num from arry is "+max);
}
}
