import java.util.Scanner;

public class FindOddNoTwodotTwo {

	public static void main(String[] args) {
		int limt, i;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the max limit: ");
		limt = sc.nextInt();
		sc.close();

		min = 79;
		System.out.print("Lit of odd limts: ");

		while (min <= limt) {

			System.out.print(min + " ");

			min = min + 2;
		}
	}
}
