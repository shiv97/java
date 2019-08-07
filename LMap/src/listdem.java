import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;

public class listdem
{
    void listdem()
    {
        // Creating a list
        List<String> l1 = new ArrayList<String>();
        l1.add("Tamil Nadu");
        l1.add("Kerala");
        l1.add("Karnataka");
        l1.add("Telangana");
        l1.add("Odisha");
        System.out.println(l1);
    }
}
class hah
{
    void hah()
    {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Tamil Nadu", "Chennai");
        capitalCities.put("Kerala", "Trivandrum");
        capitalCities.put("Karnataka", "Bengaluru");
        capitalCities.put("Telangana", "Hyderabad");
        capitalCities.put("Odisha", "Buvaneshwar");
        System.out.println(capitalCities);
    }
}
class LstofMap
{
    //conversion of list to map
    void LstofMap()
    {
                Map<Integer, String> map = new HashMap<>();
                map.put(1, "India");
                map.put(2, "Sri Lanka");
                map.put(3, "Nepal");
                map.put(4, "Bhutan");
                map.put(5, "Pakistan");
                List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
                List<String> valueList = map.values().stream().collect(Collectors.toList());
                System.out.println("Key List: " + keyList);
                System.out.println("Value List: " + valueList);

    }
}
class LMap
{
    public static void main(String a[])
    {
        System.out.println("details entered in list:");
        listdem obj= new listdem();
        obj.listdem();
        hah ob= new hah();
        ob.hah();
        LstofMap o= new LstofMap();
        o.LstofMap();
    }
}
