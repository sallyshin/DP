package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1149_2nd {

	public static void main(String[] args) throws Exception {
		
		final int R = 0;
		final int G = 1;
		final int B = 2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] ar = new int[n+1][3];
		int[][] p = new int[n+1][3]; // 더한 값

		for(int i = 1; i < n+1; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			ar[i][R] = Integer.parseInt(st.nextToken());
			ar[i][G] = Integer.parseInt(st.nextToken());
			ar[i][B] = Integer.parseInt(st.nextToken());
		}
		p[0][0] = p[0][1] = p[0][2] = ar[0][0] = ar[0][1] = ar[0][2] = 0;
		for(int i = 1; i < n+1; i++) {
			p[i][R] = ar[i][0] + Math.min(p[i-1][G], p[i-1][B]); // 빨간색을 칠했을 때
			p[i][G] = ar[i][1] + Math.min(p[i-1][R], p[i-1][B]); // 초록색을 칠했을 때
			p[i][B] = ar[i][2] + Math.min(p[i-1][R], p[i-1][G]); // 파란색을 칠했을 때
		}
		
		System.out.println(Math.min(p[n][0], Math.min(p[n][1], p[n][2])));
		
	}
}
