
public class DPFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DPFibonacci obj = new DPFibonacci();
		System.out.println(obj.topdownFibonacci(5));
		System.out.println(obj.topdownFibonacci(8));
		System.out.println(obj.topdownFibonacci(10));
		System.out.println(obj.bottomUpFibonacci(5));
		System.out.println(obj.bottomUpFibonacci(8));
		System.out.println(obj.bottomUpFibonacci(10));
		 

	}
	 
	
	
	public   int topdownFibonacci( int  n) {
		int[] fib = new int[n];
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i< n;i++){
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib[n-1];
		
	}
	public   int bottomUpFibonacci(int n){
		int[] fib = new int[n];
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		fib[0]=1;
		fib[1]= 1;
		
		if (fib[n-1]!= 0)
			return fib[n-1];
		
		return bottomUpFibonacci(n-1)+bottomUpFibonacci(n-2);
	}
	
	
	
	
	

}
