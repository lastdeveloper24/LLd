package DataStructure;

public class DoublyNode<E> {
    DoublyNode<E> next;
    DoublyNode<E> prev;
    E element;

    public DoublyNode(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public E getElement(){
        return this.element;
    }
}
