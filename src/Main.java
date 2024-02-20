import Policy.EvectionPolicy;
import Policy.LRUEvection;
import Storage.CacheStorage;
import Storage.HashMapStorage;

public class Main {
    public static void main(String[] args) {
        EvectionPolicy evectionPolicy = new LRUEvection();
        CacheStorage storage = new HashMapStorage(5);
        Cache<String,Integer> myCache = new Cache<>(evectionPolicy,storage);

        myCache.get("Divya");
        myCache.put("Partha",101);
        System.out.println("Rank is : " + myCache.get("Partha"));
    }
}