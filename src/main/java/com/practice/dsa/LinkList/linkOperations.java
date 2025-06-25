package com.practice.dsa.LinkList;

public class linkOperations {
    int size;

    linkOperations(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head = null;
    public void  addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node lastNode = new Node(data);
        if (head == null){
            head = lastNode;
            return;
        }
        Node currentNode  = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = lastNode;
    }

    public  void  printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = head;
        while (currentNode!= null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public  void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size --;
        head = head.next;
    }

    public  void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
        }
        size--;
        assert head != null;
        Node lastNode = head.next;
        Node secondLastNode = head;
        while (secondLastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
       linkOperations linkOperations =new linkOperations();
       linkOperations.addFirst("first");
       linkOperations.addLast("last");
       linkOperations.deleteFirst();
       linkOperations.addFirst("first");
       linkOperations.deleteLast();
       linkOperations.printList();
       System.out.println("Size of list"+" "+linkOperations.getSize());
    }
}
