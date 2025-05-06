import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken(); // B진법 숫자
		int B = Integer.parseInt(st.nextToken()); // 진법

		int result = 0;

		for (int i = 0; i < N.length(); i++) {
			char ch = N.charAt(i);
			int value;

			if (Character.isDigit(ch)) {
				value = ch - '0';
			} else {
				value = ch - 'A' + 10;
			}

			result = result * B + value;
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