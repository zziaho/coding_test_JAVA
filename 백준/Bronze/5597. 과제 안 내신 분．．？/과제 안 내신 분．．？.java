import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] submitted = new boolean[31];

		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			submitted[num] = true;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 30; i++) {
			if (!submitted[i])
			sb.append(i).append("\n");
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