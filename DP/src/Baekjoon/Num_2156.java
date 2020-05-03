package Baekjoon;
import java.io.*;
public class Num_2156 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] vin = new int[n+1];
		int[] max = new int[n+1];

		for(int i = 1; i <= n; i++) {
			vin[i] = Integer.parseInt(br.readLine());
		}
		if(n >= 1) max[1] = vin[1];
		if(n >= 2) max[2] = vin[1] + vin[2];
		
		for(int i = 3; i <= n; i++) {
			max[i] = Math.max(Math.max(max[i-1], vin[i] + max[i-2]), vin[i] + vin[i-1] + max[i-3]);
		}
		System.out.println(max[n]);
	}


}
