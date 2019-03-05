package main;

public class DoublyLinkedList {

  /*
   *
   * */

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
  }

}
