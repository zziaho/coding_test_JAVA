import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] remains = new int[10];
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			remains[i] = num % 42;
		}

		int counts = 10;
		for (int i = 0; i < remains.length; i++) {
			int same = 0;
			for (int j = i+1; j < remains.length; j++) {
				if (remains[i] == remains[j]) same++;
			}

			if (same >= 1) counts--;
		}

		bw.write(String.valueOf(counts));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}