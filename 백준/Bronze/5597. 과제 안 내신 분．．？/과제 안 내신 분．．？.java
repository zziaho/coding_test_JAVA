import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] allStudent = new int[30];
		int[] notSubmit = new int[2];
		Arrays.setAll(allStudent, i -> i+1);

		for (int i = 0; i < 28; i++) {
			int check = Integer.parseInt(br.readLine());

			for (int j = 0; j < allStudent.length; j++) {
				if (check == allStudent[j]) {
					allStudent[j] = 0;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < allStudent.length; k++) {
			if (allStudent[k] != 0) sb.append(allStudent[k] + "\n");
		}
		bw.write(String.valueOf(sb.delete(sb.length()-1, sb.length())));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}