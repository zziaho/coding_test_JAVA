import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		int a = Integer.parseInt(String.valueOf(B.charAt(2)));
		int b = Integer.parseInt(String.valueOf(B.charAt(1)));
		int c = Integer.parseInt(String.valueOf(B.charAt(0)));

		int result1 = A * a;
		int result2 = A * b;
		int result3 = A * c;
		int result4 = A * Integer.parseInt(B);

		bw.write(result1 + "\n");
		bw.write(result2+ "\n");
		bw.write(result3 + "\n");
		bw.write(String.valueOf(result4));

		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}