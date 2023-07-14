package arrays;

public class ConsecutiveSumPalindrome {

	public static void main(String[] args) {
		int a[]= {5,3,8,6,2,9,4};
		int sum=a[0];
		for(int i=1;i<a.length;i++) {
			
				sum=sum+a[i];
				if(palin(sum)) {
					System.out.println(sum);
				}
			
		}

	}
	public static boolean palin(int num) {
		int temp=num,rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num) {
			return true;
		}
		else {
			return false;
		}
	}

}
