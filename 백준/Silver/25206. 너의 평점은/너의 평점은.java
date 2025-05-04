import java.io.*;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double totalCredit = 0.0;
		double totalScore = 0.0;

		for (int i = 1; i <= 20; i++) {
			String[] score = br.readLine().split(" ");
			if (!score[2].equals("P")) {
				totalCredit += Double.parseDouble(score[1]);
				double avgMajor = chkGrade(score[2]);
				totalScore += avgMajor * Double.valueOf(score[1]);
			}
		}

		bw.write(String.valueOf(totalScore / totalCredit));

		bw.flush();
		bw.close();
		br.close();

	}

	public static double chkGrade(String grade) {
		double gradePoint = 0.0;
		switch (grade) {
			case "A+" : gradePoint = 4.5; break;
			case "A0" : gradePoint = 4.0; break;
			case "B+" : gradePoint = 3.5; break;
			case "B0" : gradePoint = 3.0; break;
			case "C+" : gradePoint = 2.5; break;
			case "C0" : gradePoint = 2.0; break;
			case "D+" : gradePoint = 1.5; break;
			case "D0" : gradePoint = 1.0; break;
			case "F" : gradePoint = 0.0; break;
		}

		return gradePoint;
	}

	public static void main(String[] args) throws IOException {
		solution();
	}
}