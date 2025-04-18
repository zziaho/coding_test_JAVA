import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = br.readLine();

		for (int i = 97; i <= 122; i++) {
			String alphabet = String.valueOf((char) i);

			if  (S.contains(alphabet)) {
				bw.write(String.valueOf(S.indexOf(alphabet)) + " ");
			} else {
				bw.write("-1 ");
			}
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}