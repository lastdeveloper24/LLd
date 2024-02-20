package Policy;

public interface EvectionPolicy<Key> {
    void keyAccessed(Key key);
    Key evictKey();

}
