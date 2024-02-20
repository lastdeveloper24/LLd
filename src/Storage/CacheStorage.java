package Storage;

public interface CacheStorage<Key, Value> {
    void add(Key key, Value value);
    void delete(Key key);
    Value get(Key key);
}
