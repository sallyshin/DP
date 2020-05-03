package Baekjoon;
import java.io.*;
import java.util.*;
public class Num_11057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] arr = new long[n+1][10];
		int sum = 0;

		for(int i = 0; i < 10; i++) {
			arr[1][i] = 1;
			for(int j = 2; j <= n; j++) {
				for(int k = 0; k < 10; k++) {
					arr[j][i] += arr[j-1][k];
				}
				arr[j][i] %= 10007;
			}
		}

		for(int i = 0; i < 10; i++) {
			sum += arr[n][i];
		}
		System.out.println(sum % 10007);

	}

}
