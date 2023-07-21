package arrays;

public class FibonassiElementInArray {
	public static boolean fibonassi(int num) {
		int n1=0,n2=1,n3,count=10000;
        if(num==0 || num==1) {
        	return true;
        }
        for(int i=2;i<count;i++){
            n3=n1+n2;
            
            n1=n2;
            n2=n3;
            if(n3==num) {
            	return true;
        }
            
    }
		return false;
	}
	public static void main(String[] args) {
		int a[]= {5,6,13,8,4,1,233};
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			if(fibonassi(num)) {
				System.out.println(a[i]);
			}
		}
	}

}
