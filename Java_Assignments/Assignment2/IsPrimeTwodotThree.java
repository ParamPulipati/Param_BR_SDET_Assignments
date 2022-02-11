
public class PrimeTwodotThree {

	public static void main(String args[]) {
		boolean Prime = true;
		int rem;

		int number = 13;

		for (int i = 2; i <= number / 2; i++) {
			rem = number % i;
			if (rem == 0) {
				Prime = false;
				break;
			}
		}

		if (Prime)
			System.out.println(number + " is a Prime numberber");
		else
			System.out.println(number + " is not a Prime numberber");
	}

}
