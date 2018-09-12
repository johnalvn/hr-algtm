

public class Sorting {

	public static void main(String[] args) {
		//
		//int[] a = { 7, 5, 4, 3, 2, 1, 6, 8 };
		int[] a = { 8,7,6, 5, 4, 3, 2, 1, 6, 8 };
		int n = a.length;
		int indexSize = n - 1;
		int totalSwaps = 0;
		for (int i = 0; i <= indexSize; i++) {
			int numberOfSwaps = 0;
			//for (int j = 0, stop = indexSize ; j < stop; j++) {
			for (int j = 0 ; j < indexSize ; j++) {	
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					numberOfSwaps++;
					totalSwaps++;
				}
			}
			if (numberOfSwaps == 0) {
				break;
			}/**/
		}
		System.out.println("Array is sorted in " + totalSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[indexSize]);

	}

}
