import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ClassA {
	public static void main(String[] args) throws FileNotFoundException{
		System.setIn(new FileInputStream("res/temp.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int result = 0;
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
			}

			System.out.format("#%d %d\n", test_case, result);
		}
	}
}
