
public class FindDuplicateTwodotSix {
	public static void main(String[] args) {
		int[] user_array = { 12, 32, 12, 45, 65, 93, 0, 23, 45, 6 };

		for (int i = 0; i < user_array.length - 1; i++) 
		{
			for (int j = i + 1; j < user_array.length; j++) 
			{
				if ((user_array[i] == user_array[j]) && (i != j)) 
				{
				System.out.println("Duplicate value is : " + user_array[j]);
				}
			}
		}
	}
}
