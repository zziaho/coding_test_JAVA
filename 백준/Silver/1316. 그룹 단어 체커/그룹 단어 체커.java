import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int result = n;

		for (int i = 1; i <= n; i++) {
			String word = br.readLine();

			char[] wordArr = word.toCharArray();
			ArrayList charList = new ArrayList();
			charList.add(wordArr[0]);

			for (int j = 1; j < wordArr.length; j++) {
				if (wordArr[j] != wordArr[j-1]) {
					if (charList.contains(wordArr[j])) {
						result--;
						break;
					} else {
						charList.add(wordArr[j]);
					}
				}
			}

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