package com.ccsi;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    //write a function to delete a node (except the tail) in a singly linked list,
    //given only access to that node.
    //supposed the linked list is 1->2->3->4 and you are given the third node with
    //value 3,the linked list should become 1->2->4 after calling your function.
    public static void deleteNode(ListNode node){
        if(node==null) return;
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}