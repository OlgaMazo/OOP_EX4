import static org.junit.Assert.fail;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BigThanMedianTest {

	int[] a1;
	int[] b1;
	int[] a2;
	int[] b2;
	int median1;
	int median2;

	@BeforeEach
	void setUp() throws Exception {

		int n1 = 100001; // odd
		int n2 = 200000; // even

		a1 = new int[n1];
		b1 = new int[n1];
		a2 = new int[n2];
		b2 = new int[n2];

		for (int i = 0; i < n1; i++) {
			a1[i] = (int) (Math.random() * 1000);
			b1[i] = (int) (Math.random() * 1000);
		}

		for (int i = 0; i < n2; i++) {
			a2[i] = (int) (Math.random() * 1000);
			b2[i] = (int) (Math.random() * 1000);
		}

		Arrays.sort(a1);
		Arrays.sort(b1);
		Arrays.sort(a2);
		Arrays.sort(b2);

		int[] temp1 = BigThanMedian.merge(a1, b1);
		int[] temp2 = BigThanMedian.merge(a2, b2);

		median1 = temp1[n1];
		median2 = (temp2[n2] + temp2[n2 - 1]) / 2;
	}

	@Test
	void test_bigThanMedianAlgo() {

		int[] ans1 = BigThanMedian.bigThanMedianAlgo(a1, b1);

		for (int i = 0; i < ans1.length; i++) {

			if (ans1[i] < median1) {
				fail("Error: the number is ameller than the median (odd arrays size)");
			}
		}

		int[] ans2 = BigThanMedian.bigThanMedianAlgo(a2, b2);

		for (int i = 0; i < ans2.length; i++) {

			if (ans2[i] < median2) {
				fail("Error: the number is ameller than the median (even arrays size)");
			}
		}
	}

	@Test
	void test_bigThanMedianMerge() {

		int[] ans1 = BigThanMedian.bigThanMedianMerge(a1, b1);

		for (int i = 0; i < ans1.length; i++) {

			if (ans1[i] < median1) {
				fail("Error: the number is ameller than the median (odd arrays size)");
			}
		}

		int[] ans2 = BigThanMedian.bigThanMedianMerge(a2, b2);

		for (int i = 0; i < ans2.length; i++) {

			if (ans2[i] < median2) {
				fail("Error: the number is ameller than the median (even arrays size)");
			}
		}
	}
}
