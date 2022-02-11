public class StrToArrToStrThreedotFour {
	public static void main(String[] args) {
		
		char[] char_arr = { 'B', 'R', 'O', 'A', 'D', 'R', 'I', 'D', 'G', 'E' };
		String str_arr = new String(char_arr);
		System.out.println(str_arr);

		char ch_ar[] = str_arr.toCharArray();


		for (int i = 0; i < ch_ar.length; i++) {
			System.out.println(ch_ar[i]);

		}
	}
}