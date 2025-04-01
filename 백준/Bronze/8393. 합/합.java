import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 1; i < n+1; i++) {
			result += i;
		}

		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}