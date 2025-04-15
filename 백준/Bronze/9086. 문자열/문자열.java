import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String line = br.readLine();
			bw.write(String.valueOf(line.charAt(0)) + line.charAt(line.length() == 1 ? 0 : line.length()-1) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}