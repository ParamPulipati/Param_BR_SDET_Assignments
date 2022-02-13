import java.util.*;
public class ArrayListSortFourdotSeven  {

	public static void main(String args[]){
	   ArrayList<String> sportslist = new ArrayList<String>();
	   sportslist.add("Hockey");
	   sportslist.add("Cricket");
	   sportslist.add("Baseball");
	   sportslist.add("Volleyball");
	   sportslist.add("Badminton");
	   sportslist.add("Tennis");
	   sportslist.add("Football");
	   sportslist.add("Basketball");

	   System.out.println("Items in the arraylist before sorting are:");
	   for(String sport: sportslist){
			System.out.println(sport);
		}

	   Collections.sort(sportslist);
	   System.out.println("Items in the arraylist after sorting are:");
	   for(String sport: sportslist){
			System.out.println(sport);
		}
	}
}
