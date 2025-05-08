import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[][] grid = new String[5][15];

		for (int i = 0; i < 5; i++) {
			String line = br.readLine();
			for (int j = 0; j < line.length(); j++) {
				grid[i][j] = line.substring(j, j+1);
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				bw.write(grid[j][i] == null ? "" : grid[j][i]);
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