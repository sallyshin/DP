package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int a = 1000000000;
		int n = Integer.parseInt(br.readLine());
		long[][] arr = new long[n+1][10];

		for(int i = 1; i < 10; i++){
			arr[1][i] = 1;
		}
		for(int i = 2; i <= n; i++){
			for(int j = 0; j < 10; j++){
				if(j == 0){
					arr[i][j] = arr[i-1][j+1];
				} else if(j == 9){
					arr[i][j] = arr[i-1][j-1];
				} else{
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
				}
				arr[i][j] %= a;
			}
		}
		long answer = 0;
		for(int i = 0; i < 10; i++){
			answer += arr[n][i];
		}
		System.out.println(answer % a);
	}
}