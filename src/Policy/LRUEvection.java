package Policy;

import DataStructure.DoublyLinkedList;
import DataStructure.DoublyNode;

import java.util.HashMap;
import java.util.Map;

public class LRUEvection <Key> implements EvectionPolicy<Key>{
    private DoublyLinkedList<Key>dll ;
    Map<Key, DoublyNode<Key>> keyToNodeMap ;

    public LRUEvection(){
        dll = new DoublyLinkedList<>();
        keyToNodeMap = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        if(keyToNodeMap.containsKey(key)){
            dll.detachNode(keyToNodeMap.get(key));
            dll.addNodeAtLast(keyToNodeMap.get(key));
        }
        else {
            DoublyNode<Key> node = dll.addElementAtLast(key);
            keyToNodeMap.put(key,node);
        }
    }

    @Override
    public Key evictKey() {
        DoublyNode LRUNode = dll.getFirstNode();
        dll.detachNode(LRUNode);
        keyToNodeMap.remove(LRUNode.getElement());
        return (Key) LRUNode.getElement();
    }
}
