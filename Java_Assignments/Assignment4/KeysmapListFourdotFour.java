import java.util.*;

public class KeysmapListFourdotFour {

    public static void main(String[] args) {

        Map<Integer, String> hash_map = new HashMap<>();
        hash_map.put(0, "Zero");
        hash_map.put(1, "One");
        hash_map.put(2, "Two");
        hash_map.put(3, "Three");
        hash_map.put(4, "Four");
		hash_map.put(5, "Five");
		hash_map.put(6, "Six");

        List<Integer> arrKeyList = new ArrayList(hash_map.keySet());
        List<String> arrValueList = new ArrayList(hash_map.values());
        System.out.println("Key List: " + arrKeyList);
        System.out.println("Value List: " + arrValueList);

    }
}