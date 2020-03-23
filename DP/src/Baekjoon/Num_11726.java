package Baekjoon;
import java.io.*;;

public class Num_11726 {
	
	public static int tile(int n) {
		
		int[] ar = new int[n+1];
		
		ar[1] = 1;
		ar[2] = 2;
		
		for(int i = 3; i < n+1; i++) {
			if(ar[i] > 0) return ar[i];
			else {
				ar[i] = (ar[i-1]+ ar[i-2]) % 10007; // 오버플로우 방지
			}
		}
		
		return ar[n];
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(tile(n)));
		bw.flush();
		bw.close();

	}

}
