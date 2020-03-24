package Baekjoon;
import java.util.*;
public class Num_1149 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] ar = new int[n+1][3];
		int[][] p = new int[n+1][3];

		for(int i = 1; i < n+1; i++) {

			for(int j = 0; j < 3; j++) {
				
				ar[i][j] = sc.nextInt();

			}
			sc.nextLine();
		}
		
		
	}

}
