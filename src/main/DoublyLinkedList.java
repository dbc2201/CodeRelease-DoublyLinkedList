package main;

public class DoublyLinkedList {

  /*
   *  The 'DoublyLinkedList' class will have the following attributes
   *  1. An integer variable to hold the current size of the linked list, named 'size'.
   *  2. A 'Node' type reference variable to point to the first node of the linked list.
   * */

  private int size = 0;
  private Node head = null;

  public static void main(String[] args) {

  }

  private static class Node {

    /*
     * The 'Node' class for this doubly linked list will have the following attributes
     * 1. An integer variable to hold the 'data' for the node, named 'data'.
     * 2. A 'Node' type reference variable to hold the reference of the 'Next Node', named 'next'.
     * 3. A 'Node' type reference variable to hold the reference of the 'Previous Node', named 'prev'.
     * */

    private int data;
    private Node next;
    private Node prev;

    public Node(int data, Node next, Node prev) {
      this.data = data;
      this.next = next;
      this.prev = prev;
    }

    public int getData() {
      return data;
    }

    public void setData(int data) {
      this.data = data;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    public Node getPrev() {
      return prev;
    }

    public void setPrev(Node prev) {
      this.prev = prev;
    }
  }

}
