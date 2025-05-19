import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());	// 낮에 A미터 등반
		int B = Integer.parseInt(st.nextToken());	// 밤에 B미터 하락
		int V = Integer.parseInt(st.nextToken());	// V미터 나무

		int step = A - B;	// 하루동안 올라가는 미터
		int target = V - A;	// 마지막날 아침에 A 만큼 등반해서 V에 도달하기 위해 그 전날까지 V - A까지 도달해야함
		int days = 0;

		// V - A까지 도달하는데 몇일 걸리는지
		days = target / step;
		if (target % step != 0) {
			days++;
		}
		// 마지막 날 아침에 정상에 도달
		days++;

		bw.write(String.valueOf(days));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}