import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class SetViewofKeyinHashtableFourdotEight{

  public static void main(String args[]) {

        Hashtable hash_table = new Hashtable();

        hash_table.put("Key1", "Value1");
        hash_table.put("Key2", "Value2");
        hash_table.put("Key3", "Value3");
        hash_table.put("Key4", "Value4");
        hash_table.put("Key5", "Value5");
        hash_table.put("Key6", "Value6");
        hash_table.put("Key7", "Value7");
        hash_table.put("Key8", "Value8");
        hash_table.put("Key9", "Value9");


        Set<String> set_keys = hash_table.keySet();

        System.out.println("Set of Keys are: ");

        Iterator<String> item = set_keys.iterator();

        while(item.hasNext()){
            System.out.println(item.next());
        }
    }
}