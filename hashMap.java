
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Karan", 97);
        map.put("Roshan", 85);
        map.put("Sonu", 93);
        map.put("Nyasha", 89);

        // System.out.println(map);

        // System.out.println(map.get("Sonu"));

        // System.out.println(map.keySet());
        // System.out.println(map.values());

        for(String key: map.keySet()) {
            System.out.println("Name: "+ key + ", Marks: " + map.get(key));
        }

    }
}
