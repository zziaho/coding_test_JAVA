import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine().toUpperCase(); // 입력값 전체 대문자로 변경
		int[] counts = new int[26]; // A-Z 개수 배열

		for (char ch : word.toCharArray()) {
			counts[ch - 'A']++;
		}

		int max = -1;
		char result = '?';

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > max) {
				max = counts[i];
				result = (char) (i + 'A');
			} else if (counts[i] == max) {
				// 가장 많이 사용된 알파벳이 여러개인경우
				result = '?';
			}
		}

		bw.write(result);

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}