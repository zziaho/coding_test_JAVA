import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		String result = "F";
		if (90 <= a && a <= 100) {
			result = "A";
		} else if (80 <= a && a <= 89) {
			result = "B";
		} else if (70 <= a && a <= 79) {
			result = "C";
		} else if (60 <= a && a <= 69) {
			result = "D";
		} else if (60 < a) {
			result = "F";
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