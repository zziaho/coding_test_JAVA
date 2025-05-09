import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] paper = new int[100][100];
		int count = Integer.parseInt(br.readLine());
		int totalExtent = 0;

		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());

			for (int a = width; a < width+10; a++) {
				for (int b = height; b < height+10; b++) {
					if (paper[a][b] != 1) {
						paper[a][b] = 1;
						totalExtent++;
					}
				}
			}
		}

		bw.write(String.valueOf(totalExtent));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}