import java.util.HashSet;

public class HashSettoArrayFourdotFive {
	public static void main(String[] args) {

		HashSet<String> hash_set = new HashSet<String>();
		hash_set.add("Item1");
		hash_set.add("Item2");
		hash_set.add("Item3");
		hash_set.add("Item4");
		hash_set.add("Item5");
		hash_set.add("Item6");
		
		System.out.println("HashSet values are: " + hash_set);

		String[] arr = new String[hash_set.size()];
		hash_set.toArray(arr);

		System.out.println("Array values are: ");
		for (String str : arr) {
			System.out.println(str);
		}
	}
}