import java.util.Scanner;

public class PalindromeThreedotTwo {

	public static void main(input_stringing[] args) {
		String input_string, rev_string = "";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a input_stringing:");
		input_string = obj.nextLine();
		obj.close();
		int length = input_string.length();

		for (int i = length - 1; i >= 0; i--)
			rev_string = rev_string + input_string.charAt(i);

		if (input_string.equals(rev_string))
			System.out.println(input_string + " is a palindrome");
		else
			System.out.println(input_string + " is not a palindrome");

	}

}
