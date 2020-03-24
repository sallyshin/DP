package Baekjoon;
import java.util.*;
public class Num_1149 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] ar = new int[n+1][3];
		int[][] p = new int[n+1][3]; // ���� ��

		for(int i = 1; i < n+1; i++) {

			for(int j = 0; j < 3; j++) {
				
				ar[i][j] = sc.nextInt();

			}
		}
		p[0][0] = p[0][1] = p[0][2] = ar[0][0] = ar[0][1] = ar[0][2] = 0;
		for(int i = 1; i < n+1; i++) {
			p[i][0] = ar[i][0] + Math.min(p[i-1][1], p[i-1][2]); // �������� ĥ���� ��
			p[i][1] = ar[i][1] + Math.min(p[i-1][0], p[i-1][2]); // �ʷϻ��� ĥ���� ��
			p[i][2] = ar[i][2] + Math.min(p[i-1][0], p[i-1][1]); // �Ķ����� ĥ���� ��
		}
		
		System.out.println(Math.min(p[n][0], Math.min(p[n][1], p[n][2])));
		
		
	}
}
