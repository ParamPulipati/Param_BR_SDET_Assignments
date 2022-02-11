import java.util.Scanner;

public class ReversNoTwodotFive {

	public static void main(String args[]) {

		int number = 0;
		int revnumber = 0;
		System.out.println("enter your number ");

		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();
		sc.close();

		while (number != 0) {
			revnumber = revnumber * 10;
			revnumber = revnumber + number % 10;
			number = number / 10;
		}

		System.out.println("Reverse of number is: " + revnumber);
	}

}
