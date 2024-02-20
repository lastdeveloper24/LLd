package DataStructure;

public class DoublyLinkedList<E> {

    DoublyNode<E> dummyHead;
    DoublyNode<E> dummyTail;

    public DoublyLinkedList() {
        // We can instantiate these by null, since we are never gonna use val for these dummyNodes
        dummyHead = new DoublyNode<>(null);
        dummyTail = new DoublyNode<>(null);

        // Also Initially there are no items
        // so just join dummyHead and Tail, we can add items in between them easily.
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    /**
     * Method to detach a random node from the doubly linked list. The node itself will not be removed from the memory.
     * Just that it will be removed from the list and becomes orphaned.
     *
     * @param node Node to be detached.
     */
    public void detachNode(DoublyNode<E> node) {
        // Just Simply modifying the pointers.
        if (node != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    /**
     * Helper method to add a node at the end of the list.
     *
     * @param node Node to be added.
     */
    public void addNodeAtLast(DoublyNode<E> node) {
        DoublyNode tailPrev = dummyTail.prev;
        tailPrev.next = node;
        node.next = dummyTail;
        dummyTail.prev = node;
        node.prev = tailPrev;
    }

    /**
     * Helper method to add an element at the end.
     *
     * @param element Element to be added.
     * @return Reference to new node created for the element.
     */
    public DoublyNode<E> addElementAtLast(E element) {

        DoublyNode<E> newNode = new DoublyNode<>(element);
        addNodeAtLast(newNode);
        return newNode;
    }

    public boolean isItemPresent() {
        return dummyHead.next != dummyTail;
    }

    public DoublyNode getFirstNode()  {
        DoublyNode item = null;
        if (!isItemPresent()) {
            return null;
        }
        return dummyHead.next;
    }

    public DoublyNode getLastNode()  {
        DoublyNode item = null;
        if (!isItemPresent()) {
            return null;
        }
        return dummyTail.prev;
    }
}