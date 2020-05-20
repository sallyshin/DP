package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num_2193 {
	// 이친수
	public static long[] two = new long[90];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static long bottomUp(long n){ // 피보나치로 풀 수 있음
		two[0] = 1;
		two[1] = 1;

		for(int i = 2; i < n; i++) {
			two[i] = two[i-1] + two[i-2];
		}
		return two[(int) (n-1)];
	}

	public static void main(String[] args) throws IOException{

		int n = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(bottomUp(n)));

		br.close();
		bw.flush();
		bw.close();

	}
}