import java.util.TreeSet;

public class TreesetHighLowFourdotSix {

	public static void main(String[] args) {

		TreeSet<String> tree_set = new TreeSet<String>();

		tree_set.add("Item1");
		tree_set.add("Item16");
		tree_set.add("Item29");
		tree_set.add("Item2");
		tree_set.add("Item8");
		tree_set.add("Item11");
		tree_set.add("Item3");
		tree_set.add("Item6");
		tree_set.add("Item4");

		System.out.println("Highest value Stored in the TreeSet is : " + tree_set.last());
		System.out.println("Lowest value Stored in the TreeSet is : " + tree_set.first());
	}
}
