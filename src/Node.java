public class Node <E> {

  public Node<E> next;
  public E item;

  public Node(E element, Node<E> next){
    this.item = element;
    this.next = next;
  }


}
