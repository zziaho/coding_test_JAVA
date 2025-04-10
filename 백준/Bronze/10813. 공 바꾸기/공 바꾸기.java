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
		for (int b = 0; b < basketArr.length; b++) {
			basketArr[b] = b+1;
		}

		for (int a = 0; a < M; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int iOriValue = basketArr[i-1];
			int jOriValue = basketArr[j-1];
			basketArr[i-1] = jOriValue;
			basketArr[j-1] = iOriValue;
		}

		String result = "";
		for (int c = 0; c < basketArr.length; c++) {
			if (c == basketArr.length - 1) result += basketArr[c];
			else result += basketArr[c] + " ";
		}
		bw.write(result);

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}