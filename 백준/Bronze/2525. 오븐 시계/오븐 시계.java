import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());

		if ((m+t) > 60) {
			h += (m+t) / 60;
			m = (m+t) % 60;
			bw.write((h > 24 ? h-24 : h == 24 ? 0 : h) + " " + m);
		} else if ((m+t) == 60) {
			bw.write(((h+1) == 24 ? 0 : h+1) + " 0");
		} else if ((m+t) == 0) {
			bw.write(h + " " + m);
		} else if (60 > (m+t) && (m+t) > 0) {
			bw.write(h + " " + (m+t));
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}