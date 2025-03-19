import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
//		각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, t;
		
		t = sc.nextInt();
		
		int[] arrT = new int[t];
		
		for(int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arrT[i] = a + b;
		}
		
		for(int i = 1; i <= arrT.length; i++) {
			System.out.println("Case #" + i + ": " + arrT[i-1]);
		}
		
	}

}