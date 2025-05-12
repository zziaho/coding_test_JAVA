import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int ori = 2;

		for (int i = 1; i <= N; i++) {
			if (i == 1) ori += 1;
			else ori += Math.pow(2, i-1);
		}

		bw.write(String.valueOf(ori*ori));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}