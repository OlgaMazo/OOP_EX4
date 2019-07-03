/**
 * This class represent thread that return the bigger number between two numbers
 * @author Daniel and Olga
 */
public class BigThanMedianThread extends Thread{
	
	private int a; //the first element
	private int b; //the second element
	private int ans; //answer
	
	/**
	 * BigThanMedianThread constructor
	 * @param a - the first element
	 * @param b - the second element
	 */
	public BigThanMedianThread(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * get_ans
	 * @return - the answer
	 */
	public int get_ans() {
		return ans;
	}

	/**
	 * run
	 * the thread operation - calculate the bigger number between two numbers
	 */
	public void run() {
		ans = Math.max(a, b);
	}
}
