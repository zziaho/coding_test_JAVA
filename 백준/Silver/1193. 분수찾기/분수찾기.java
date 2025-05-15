import java.io.*;


public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine()); // input

		int start = 1;
		int startPlus = 1;
		int end = 1;
		int endPlus = 2;
		int value = 0;
		boolean isBetween = false;

		while (!isBetween) {
			if (start <= X && X <= end) {
				int a, b;
				if (value == 0) {
					bw.write("1/1");
					break;
				} else if (value % 2 == 0) {
					a = value;
					b = 0;
					boolean isEven = true;
					function(X, start, a, b, isEven);
				} else if (value % 2 == 1) {
					a = 0;
					b = value;
					boolean isEven = false;
					function(X, start, a, b, isEven);
				}

				isBetween = true;
				break;
			} else {
				start += startPlus++;
				end += endPlus++;
				value++;
			}
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static void function(int X, int start, int a, int b, boolean isEven) {
		for (int i = 1; i <= X - start; i++) {
			if (isEven) {
				a--;
				b++;
			} else {
				a++;
				b--;
			}
		}
		System.out.println((a+1) + "/" + (b+1));

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}