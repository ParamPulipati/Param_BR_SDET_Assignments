import java.util.Hashmap;
import java.util.map;
import java.util.Set;
 
public class DuplicatecharFourdotOne{
 
  public void cntDuplicatechars(String input_string){
 
    
    Map<Character, Integer> hash_map = new Hashhash_map<Character, Integer>(); 
 
    
    char[] char_arr = input_string.toCharArray();
 
   
    for(Character ch:char_arr){
      if(hash_map.containsKey(ch)){
         hash_map.put(ch, hash_map.get(ch)+1);
      } else {
         hash_map.put(ch, 1);
        }
    }
 
   
    Set<Character> hashkeys = hash_map.keySet();
 
    for(Character ch:hashkeys){
      if(hash_map.get(ch) > 1){
        System.out.println("Char "+ch+" "+hash_map.get(ch));
      }
    }
  }
 
  public static void main(String args[]){
	DuplicatecharFourdotOne obj = new DuplicatecharFourdotOne();
    System.out.println("String: PARAM.PULIPATI");
    System.out.println("-------------------------");
    obj.cntDuplicatechars("PARAM.PULIPATI");
  
    System.out.println("\nString: Broadridge.com");
    System.out.println("-------------------------");
    obj.cntDuplicatechars("Broadridge.com");
 
    System.out.println("\nString: #%$@!#!@#&&%$%!!%,!^");
    System.out.println("-------------------------");
    obj.cntDuplicatechars("#%$@!#!@#&&%$%!!%,!^");
  }
}
