package GlobalDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalMap {

    // Step 1: Create a private static instance of the class (the Singleton instance)
    private static GlobalMap instance;

    // Step 2: Create a private map to hold the key-value pairs
    private Map<Object, List<Object>> map;

    // Step 3: Private constructor to prevent instantiation from other classes
    private GlobalMap() {
        map = new HashMap<>();
    }

    // Step 4: Public method to provide access to the singleton instance
    public static GlobalMap getInstance() {
        if (instance == null) {
            synchronized (GlobalMap.class) {
                if (instance == null) {
                    instance = new GlobalMap();
                }
            }
        }
        return instance;
    }

    // Step 5: Method to put a key-value pair in the map
    public void put(Object key, Object value) {
        if(map.containsKey(key)){
            List<Object>ls = map.get(key);
            ls.add(value);
            map.put(key,ls);
        }
        else{
            List<Object>ls = new ArrayList<>();
            ls.add(value);
            map.put(key, ls);
        }

    }

    // Step 6: Method to get a value by key from the map
    public List<Object> get(Object key) {
        return map.get(key);
    }

    // Optional: Method to check if a key exists
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    // Optional: Method to remove a key-value pair
    public void remove(Object key) {
        map.remove(key);
    }
}
