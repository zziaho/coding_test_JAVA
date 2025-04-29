import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int total = N * 2 - 1;
		for (int i = 1; i <= total; i++) {
			int spaces = Math.abs(N - i);
			int stars = total - spaces * 2;

			for (int j = 1; j <= spaces; j++) {
				sb.append(" ");
			}
			for (int j = 1; j <= stars; j++) {
				sb.append("*");
			}
			sb.append("\n");
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