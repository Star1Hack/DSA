/*
 Single Linked List Implementation Generic Implementation
 @author : codedsun
 Source: https://medium.com/@codedsun/linked-list-simplified-e1d26cceab55
 */
public class SinglyLinkedList<E> {

    public static class Node<E> {

        private Node<E> next;
        private E element;

        Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> next){
            this.next = next;
        }
        public void setElement(E e){
            this.element = element;
        }

    }
    public Node<E> head = null;
    public Node<E> tail = null;
    private static int size = 0;

    public boolean isEmpty(){
        return size==0;
    }

    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        Node<E> newest = new Node(e, head);
        head = newest;
        if(size == 0) {
            tail = newest;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node(e,null);
        if(size == 0){
            head = tail = newest;
        }
        else {
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }

    public E removeFirst(){
        if(isEmpty()) return null;
        E data = head.getElement();
        head = head.getNext();
        size--;
        return data;

    }

    public void printList(){
        //traversing the LL
        Node<E> node = head;
        while(node!=null){
            System.out.print(node.getElement()+" ");
            node = node.getNext();
        }
     }

     public int getSize(){
        return size;
     }
}