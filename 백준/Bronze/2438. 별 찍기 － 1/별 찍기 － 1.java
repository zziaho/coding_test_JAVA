import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			String stars = "";
			for (int j = 1; j <= i; j++) {
				stars += "*";
			}
			bw.write(stars + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}