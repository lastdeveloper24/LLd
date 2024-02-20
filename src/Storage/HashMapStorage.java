package Storage;

import java.util.HashMap;

public class HashMapStorage <Key, Value> implements CacheStorage<Key, Value>{
    private HashMap<Key, Value> storage ;
    int capacity;

    public HashMapStorage( int capacity) {
        this.storage = new HashMap<>();
        this.capacity = capacity;
    }


    @Override
    public void add(Key key, Value value) {
        if(isStoragefull()){
            throw new RuntimeException("storage is full");
        }
        storage.put(key, value);
    }

    @Override
    public void delete(Key key) {
        if(!storage.containsKey(key)) {
            throw new RuntimeException(key + "does not exist");
        }
        storage.remove(key);
    }

    @Override
    public Value get(Key key) {
        if(!storage.containsKey(key)){
            throw new RuntimeException(key+"does not exist");
        }
        return storage.get(key);
    }

    private boolean isStoragefull(){
        if(storage.size()==capacity){
            return true;
        }
        return false;
    }
}
