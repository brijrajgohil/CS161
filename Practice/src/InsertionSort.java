import acm.program.*;


public class InsertionSort extends ConsoleProgram {

	public void run() {
		int[] a = {5, 6, 4, 2, 8, 1};
		for(int j = 1; j < a.length; j++) {
			int k = a[j];
			int i = j - 1;
			while(i > 0 && a[i] > k) {
				a[i+1] = a[j];
				i--;
			}
			a[i+1] = k;
		}
		println(a);
	}

}
