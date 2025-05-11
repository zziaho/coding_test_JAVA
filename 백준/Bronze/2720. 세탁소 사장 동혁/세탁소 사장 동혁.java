import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] money = {25, 10, 5, 1};

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int C = Integer.parseInt(br.readLine());
			for (int j = 0; j < money.length; j++) {
				int count = (int) (C / money[j]);
				bw.write(String.valueOf(count) + " ");
				C = C - (count * money[j]);
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}