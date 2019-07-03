/**
 * This class represent program that calculates all the larger organs by subtracting the resulting array by merging two
 * the data arrays.
 * @author Daniel and Olga
 */
public class BigThanMedian {

	/**
	 *The function accepts two arrays and the length value is sorted in ascending order 
	 *and returns an array of numbers whole containing all the larger organs than the median of a temperate array.
	 * @param a - the first array
	 * @param b - the second array
	 * @return - array of numbers whole containing all the larger organs than the median of a temperate array
	 */
	public static int[] bigThanMedianAlgo(int[] a, int[] b) {

		//start time
		long startTime = System.nanoTime();

		int n = a.length;
		int[] ans = new int[n]; //the result array

		//move over the two arrays
		for (int i = 0; i < n; i++) {

			//taking the largest organ from the first and last of the two arrays - the thread operation
			BigThanMedianThread t = new BigThanMedianThread(a[i], b[n - i - 1]);
			t.start();

			//join so the main proccess will wait until the thread will be done
			try {
				t.join();
			} catch (InterruptedException e) {
			}

			//put in the result array the bigger number
			ans[i] = t.get_ans();

		}

		//end time
		long totalTime = System.nanoTime() - startTime;
		System.out.println("total time algo: " + totalTime);

		//return the result array
		return ans;
	}

	/**
	 * bigThanMedianMerge
	 * accepts the same two arrays of random numbers sorted and returns an array of integers containing all
	 * the organs are greater than the median of the temperate array. The function uses a standard two-array merge.
	 * @param a - the first array
	 * @param b - the second array
	 * @return - array of numbers whole containing all the larger organs than the median of a temperate array
	 */
	public static int[] bigThanMedianMerge(int[] a, int[] b) {

		//start time
		long startTime = System.nanoTime();

		int n = a.length;
		int[] ans = new int[n]; //answer

		//merge the arrays into temp
		int[] temp = merge(a, b);

		//copy the first half of the merged array into the ans array
		for (int l = 0, t = n; l < n; l++, t++) {
			ans[l] = temp[t];
		}

		//end time
		long totalTime = System.nanoTime() - startTime;
		System.out.println("total time merge: " + totalTime);

		return ans;
	}

	/**
	 * merge
	 * @param a - the first array
	 * @param b - the second array
	 * @return - the merged array
	 */
	public static int[] merge(int[] a, int[] b) {

		int n = a.length;
		int[] temp = new int[2 * n]; //array size
		int i = 0, j = 0, k = 0; //indexes 

		//while two arrays have more elements compare them
		while (i < n && j < n) {

			//choose the bigger element
			if (a[i] < b[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = b[j++];
			}
		}

		//if one of the arrays empty
		while (i < n) {
			temp[k++] = a[i++];
		}

		//if one of the arrays empty
		while (j < n) {
			temp[k++] = b[j++];
		}

		return temp;
	}
}