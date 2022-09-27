package tandemloop;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		int n = 1;
		for(int i = 1;i<=a;i++) {
			System.out.println(n);
			n=n+2;
		}
		
	}
}
