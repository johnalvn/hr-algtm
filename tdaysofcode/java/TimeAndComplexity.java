
public class TimeAndComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(isPrime(3));
		
	}
	
	public static boolean isPrime(int n) {
			
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		
		}
		return true;
	}

}
