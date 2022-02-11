import java.util.Scanner;
public class SumDigitsTwodotFour {

	public static void main(String arg[]) {
		long number, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		
		number = sc.nextLong();
		sc.close();
		
		for (sum = 0; number != 0; number /= 10) {
			sum += number % 10;
		}
		System.out.println("Sum of digits is" + sum);
	}

}
