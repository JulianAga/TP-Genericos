public class Stack <E> {

  private Node<E> head;

  private void addFirst(E item) {
    head = new Node<E>(item, head);
  }

  public void push(E e) {
    if (head == null) {
      addFirst(e);
    } else {
      Node<E> tmp = head;
      while (tmp.next != null)
        tmp = tmp.next;
      tmp.next = new Node<E>(e, null);
    }
  }

  public E pop(){
    if (head==null){
      return null;
    }else {
      Node<E> tmp = head;
      while (tmp.next != null)
        tmp = tmp.next;
    return tmp.item;}
  }

  public Integer size() {
    Integer size = 1;
    if (head == null) {
      return 0;
    }
    else{
      Node<E> tmp = head;
      while (tmp.next != null) {
        size++;
        tmp = tmp.next;
      }
    }
    return size;
  }
}