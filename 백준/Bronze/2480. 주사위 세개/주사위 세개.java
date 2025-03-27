import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());


		if (a != b && b != c && c != a) {
			int biggestVal = a > b ? a > c ? a : c : b > c ? b : c;
			bw.write(String.valueOf(biggestVal * 100));

		} else if ((a == b && b != c) || (a == c && a != b) || (b == c && b != a)) {
			int sameVal = a == b ? a : a == c ? a : b;
			bw.write(String.valueOf(1000 + sameVal * 100));

		} else if (a == b && b == c) {
			bw.write(String.valueOf(10000 + a * 1000));
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}