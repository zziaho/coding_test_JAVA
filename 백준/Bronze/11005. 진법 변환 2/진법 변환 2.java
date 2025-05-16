import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");

		int N = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);

		StringBuilder sb = new StringBuilder();

		while (N > 0) {
			int remain = N % B;
			if (remain < 10) {
				sb.append((char) ('0' + remain));  // 0~9
			} else {
				sb.append((char) ('A' + (remain - 10)));  // A~Z
			}
			N /= B;
		}

		bw.write(sb.reverse().toString());

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}