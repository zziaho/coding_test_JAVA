import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] grid = new int[9][9];
		int max = 0;	// 최대값
		int a = 0, b = 0;	// 행, 열

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
				if (i == 0 && j == 0) {
					max = grid[i][j];
					a = i;
					b = j;
				} else {
					if (grid[i][j] >= max) {
						max = grid[i][j];
						a = i;
						b = j;
					}
				}
			}
		}

		bw.write(String.valueOf(max) + "\n" + String.valueOf(a+1) + " " + String.valueOf(b+1));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}