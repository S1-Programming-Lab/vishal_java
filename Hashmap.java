import java.util.*;
public class Hashmap
{
public static void main(String args[])
{
Map<Integer,
String> hash_map=new HashMap<Integer,String>();
hash_map.put(1,"Archana");
hash_map.put(5,"Neethu ");
hash_map.put(17,"Amrutha");
hash_map.put(2,"Aparna");
hash_map.put(3,"Aswani");
System.out.println("Mappings are "+hash_map);
String removed_value=(String)hash_map.remove(3);
System.out.println("Removed value is "+removed_value);
hash_map.replace(1,"Nandhitha");
System.out.println("Updated Mappings are "+hash_map);
}
}
