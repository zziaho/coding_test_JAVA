import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		double[] scoreArr = new double[N];
		int max;

		double sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			scoreArr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(scoreArr);
		max = (int) scoreArr[N-1];
		for (double score : scoreArr) {
			sum += score / max * 100;
		}

		bw.write(String.valueOf(sum / N));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}