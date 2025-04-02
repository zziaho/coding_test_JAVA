import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int a, b, result;
			StringTokenizer st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				result = a + b;
				bw.write(result + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}