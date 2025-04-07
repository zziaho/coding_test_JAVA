import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] numArr = new int[9];
		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			numArr[i] = num;
		}

		int max = Arrays.stream(numArr).max().getAsInt();
		for (int j = 0; j < numArr.length; j++) {
			if (numArr[j] == max) {
				bw.write(max + "\n");
				bw.write(String.valueOf(j+1));
				break;
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