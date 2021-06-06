package com.dsa.linkedlist;

public class SinglyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int i){
			data = i;
			next = null;
		}
	}
	
	public static SinglyLinkedList insert(SinglyLinkedList list, int data) {
		Node curNode = new Node(data);
		curNode.next = null;
		if (list.head == null) {
			list.head = curNode;
		}
		else {
			Node lastNode = list.head;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = curNode;	
		}
		return list;
	}
	
	public static void printList(SinglyLinkedList list) {
		Node curNode = list.head;
		System.out.print("List: ");
		while (curNode != null) {
			System.out.print(curNode.data+" ");
			curNode = curNode.next;
		}
	}
	
	public static void reverseList(SinglyLinkedList list) {
		Node node = list.head;
		Node prev = null;
		Node curr = node;
		Node next = null;
		System.out.print("\nReversed List: ");
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node = prev;
		System.out.println(prev.data+" ");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		printList(list);
		reverseList(list);
	}

}
