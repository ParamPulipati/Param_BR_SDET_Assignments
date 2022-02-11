public class WordCheckThreedotThree {
	public static void main(String[] args) {
		String input_string = "A brown fox ran away fast";
		int ind = input_string.indexOf("brown");
		if(ind == - 1) {
			System.out.println("brown not found");
		} else {
			System.out.println("Found brown at index "+ ind);
		}
	}
}