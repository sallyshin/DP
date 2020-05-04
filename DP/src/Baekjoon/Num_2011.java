package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Num_2011 {

	static int mod = 1000000;

	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();

		int[] arr = new int[ch.length + 1];
		arr[0] = 0;
		for(int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(ch[i-1] + "");
		}
		int[] dp = new int[ch.length + 1];
		dp[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(1 <= arr[i] && arr[i] <= 9) { // 숫자의 첫번째 수는 한자리로
				dp[i] = (dp[i] + dp[i-1]) % mod;
			}
			if(i > 1) { // 숫자 두번째부터는 두자리도 고려
				int value = arr[i-1] * 10 + arr[i];

				if(10 <= value && value <= 26) {
					dp[i] = (dp[i] + dp[i-2]) % mod;
				}
			}
		}
		
		System.out.println(dp[ch.length]);

	}
}