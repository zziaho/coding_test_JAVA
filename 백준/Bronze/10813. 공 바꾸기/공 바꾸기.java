import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] basketArr = new int[N];
		Arrays.setAll(basketArr, i -> i+1);

		for (int a = 0; a < M; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int iOriValue = basketArr[i-1];
			int jOriValue = basketArr[j-1];
			basketArr[i-1] = jOriValue;
			basketArr[j-1] = iOriValue;
		}

		StringBuilder sb = new StringBuilder();
		for (int c = 0; c < basketArr.length; c++) {
			if (c == basketArr.length - 1) sb.append(basketArr[c]);
			else sb.append(basketArr[c] + " ");
		}
		bw.write(String.valueOf(sb));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}