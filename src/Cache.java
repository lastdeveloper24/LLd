import Policy.EvectionPolicy;
import Policy.LRUEvection;
import Storage.CacheStorage;

import java.security.Key;

public class Cache<Key, Value> {
    private final EvectionPolicy<Key> evectionPolicy;
    private final CacheStorage<Key, Value> cacheStorage;

    public Cache(EvectionPolicy<Key> evectionPolicy, CacheStorage<Key, Value> cacheStorage) {
        this.evectionPolicy = evectionPolicy;
        this.cacheStorage = cacheStorage;
    }

    public Value get(Key key){
        try {
            Value value = cacheStorage.get(key);
            evectionPolicy.keyAccessed(key);
            return value;
        }catch (RuntimeException e){
            System.out.println("error : " + e.getMessage());
        }
        return null;
    }

    public void put(Key key, Value value){
        try {
            cacheStorage.add(key, value);
            evectionPolicy.keyAccessed(key);
        }catch (RuntimeException e){
            System.out.println("storage is full");
            Key evictedkey = evectionPolicy.evictKey();

            cacheStorage.delete(evictedkey);
            System.out.println("evicted key is " + evictedkey);
            put(key,value);
        }
    }
}
