public class LinkedList {

  private Node head;
  private Node tail;
  private int Length;

  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    Length = 1;
  }

  public LinkedList() {
    this(0);
  }
}
