import java.util.*;

public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		int result = f.calculate(Integer.parseInt(args[0]));
		System.out.println(result);
	}

	// Returns the nth fibonnaci number, assuming 0 is the 0th 
	// fibonnaci number in the sequence
	private int calculate(int nthNum) {

		int[] dp = new int[nthNum+1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= nthNum; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[nthNum];
	}
}