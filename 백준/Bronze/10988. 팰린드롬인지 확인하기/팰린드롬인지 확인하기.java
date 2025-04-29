import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();

		String[] right = new String[word.length()];
		String[] reverse = new String[word.length()];
		boolean isPalindrome = false;

		for (int i = 0; i < word.length(); i++) {
			right[i] = word.substring(i, i+1);
		}
		for (int i = 0; i < word.length(); i++) {
			reverse[i] = word.substring(word.length()-(i+1),word.length()-i);
		}

		isPalindrome = Arrays.equals(right, reverse);
		bw.write(isPalindrome ? "1" : "0");

		bw.flush();
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}