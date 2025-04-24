import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			String temp = str.substring(i, i+1);
			switch (temp) {
				case "A": case "B": case "C": result += 3; break;
				case "D": case "E": case "F": result += 4; break;
				case "G": case "H": case "I": result += 5; break;
				case "J": case "K": case "L": result += 6; break;
				case "M": case "N": case "O": result += 7; break;
				case "P": case "Q": case "R": case "S": result += 8; break;
				case "T": case "U": case "V": result += 9; break;
				default: result += 10; break;
			}
		}

		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}