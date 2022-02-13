import java.util.*;

public class RevArrayListFourdotTwo
{
    public static void main(String[] args) 
    {
        ArrayList<String> array_list = new ArrayList<String>(); 
 
        array_list.add("Hi");         
        array_list.add("This");        
        array_list.add("is");
        array_list.add("Broadridge");
        array_list.add("Financial");         
        array_list.add("Solutions");
                 
        System.out.println("Before Reverse");         
        System.out.println(array_list);
        Collections.reverse(array_list);
        System.out.println("After Reverse");         
        System.out.println(array_list);
    }
} 
