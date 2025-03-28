package com.pushpa.corejava.datastructures;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node listNode = new Node(10);
        listNode.next = new Node(20);
        listNode.next.next = new Node(30);
        listNode.next.next.next = new Node(40);
        listNode.next.next.next.next = new Node(50);
        System.out.println("Initial Linked list values : ");
        printLinkedList(listNode);
        System.out.println("Reverse Linked list values : ");
        Node reverseNode = reverseLinkedList(listNode);
        printLinkedList(reverseNode);
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void printLinkedList(Node node) {
        while (node != null) {
            System.out.println("Node Values : "+node.data);
            node = node.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data; this.next = null;
    }
}
