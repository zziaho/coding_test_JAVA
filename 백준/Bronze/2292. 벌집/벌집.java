import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int space = 2;			// 칸 수
		int startPoint = 1;		// 시작 포인트
		int endPoint = 1;		// 끝 포인트
		int count = 1;			// 6의 배수 처리용
		boolean isContain = false;

		while (!isContain) {
			if (N != 1) {
				startPoint = endPoint + 1;
				endPoint = startPoint + (6 * count++) - 1;

				if (startPoint <= N && N <= endPoint) {
					bw.write(String.valueOf(space));
					isContain = true;
					break;
				} else {
					space++;
				}
			} else if (N == 1) {
				bw.write("1");
				isContain = true;
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