package tandemloop;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		int n = 1;
		if(a<=2) {
			System.out.println(n);
		}
		else if(a>2) {
			if(a%2==0) {
				a--;
			}
			for(int i = 1;i<=a;i++) {
				System.out.println(n);
				n=n+2;
			}
		}
	}
}
