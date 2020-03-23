package Baekjoon;

import java.io.*;

public class Num_9095 {

	public static int count(int n) {

		int[] ar = new int[n + 1];

		ar[1] = 1;
		ar[2] = 2;
		ar[3] = 4;

		for(int i = 4; i < n+1; i++) {
			if(ar[i] > 0) return ar[i];
			else {
				ar[i] = ar[i-1] + ar[i-2] + ar[i-3];
			}
		}

		return ar[n];

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine()); // 케이스 갯수

		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(count(n)));
			bw.write("\n");
		}

		bw.close();

	}

}
