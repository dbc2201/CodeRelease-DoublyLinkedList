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
    DoublyLinkedList linkedList = new DoublyLinkedList();
    System.out.println(linkedList);
  }

  /*
   * The 'toString()' method will be used to print the values of the linked list as a String
   * */

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    //  check if the size of the linked list is zero, then display "list is empty"
    if (size == 0) {
      System.out.println("The list is currently empty.");
    } else {  //  if the list is not empty, traverse and append the values

      //  append the "[ null <==> " to the result to depict the head node's previous is null
      result.append("[ null <==> ");

      /*
      * Steps to traverse a linear linked list.
      * 1. Copy the head node's reference to a new 'Node' type reference, 'temp'
      * 2. Check if the node is not null
      * 3. Change the reference of 'temp' to the next node on each iteration
      * */

      //  copy the head's reference to temp
      Node temp = this.head;

      //  check if the node is not null
      while (temp != null) {

        // append the node's data to the result
        result.append(temp.getData());

        // change the reference of temp
        temp = temp.getNext();
      }

      //  append the "<==> null ] " to the result to depict the tail node's next is null
      result.append(" <==> null ]");
    }

    return result.toString();
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
