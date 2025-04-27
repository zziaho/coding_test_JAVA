import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] pieces = {1, 1, 2, 2, 2, 8};

		int[] count = new int[6];
		for (int i = 0; i < count.length; i++) {
			count[i] = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(pieces[i] - count[i]) + " ");
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}