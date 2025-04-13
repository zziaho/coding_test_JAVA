import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] basketArr = new int[N+1];
		Arrays.setAll(basketArr, i -> i);

		for (int a = 1; a <= M; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int temp = j;

			// 1, 2, 3, 4, 5
			int[] tempArr = new int[j-i+1];
			for (int b = 0; b < tempArr.length; b++) {
				tempArr[b] = basketArr[temp--];
			}

			int zero = 0;
			for (int c = i; c <= j; c++) {
				basketArr[c] = tempArr[zero++];
			}
		}

		for (int i = 1; i < basketArr.length; i++) {
			bw.write(basketArr[i] + " ");
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}