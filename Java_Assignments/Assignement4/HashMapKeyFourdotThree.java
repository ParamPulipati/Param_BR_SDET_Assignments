import java.util.HashMap;

public class HashMapKeyFourdotThree {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(0, "Zero");
		hash_map.put(1, "One");
		hash_map.put(2, "Two");
		hash_map.put(3, "Three");
		hash_map.put(4, "Four");
		hash_map.put(5, "Five");

		boolean b1 = hash_map.containsKey(10);
		System.out.println("Key 22 exists in hash map : " + b1);

		boolean b2 = hash_map.containsKey(5);
		System.out.println("Key 55 exists in hash map : " + b2);

		boolean b3 = hash_map.containsKey(2);
		System.out.println("Key 99 exists in hash map : " + b3);
	}
}
