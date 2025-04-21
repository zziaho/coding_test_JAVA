import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();

		String[] arr = new String[a.length()];
		String[] brr = new String[b.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.substring(i, i+1);
			brr[i] = b.substring(i, i+1);
		}

		String aTemp = arr[0];
		String bTemp = brr[0];
		arr[0] = arr[2];
		arr[2] = aTemp;
		brr[0] = brr[2];
		brr[2] = bTemp;

		String aVal = "", bVal = "";
		int intA, intB;
		for (int i = 0; i < 3; i++) {
			aVal += arr[i];
			bVal += brr[i];
		}
		intA = Integer.parseInt(aVal);
		intB = Integer.parseInt(bVal);

		bw.write(String.valueOf(Math.max(intA, intB)));

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}