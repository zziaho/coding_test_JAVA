import java.io.*;
import java.util.*;

public class Main {

	public static void solution() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("|\\_/|\n");
		bw.write("|q p|   /}\n");
		bw.write("( 0 )\"\"\"\\\n");
		bw.write("|\"^\"`    |\n");
		bw.write("||_/=\\\\__|");

		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}