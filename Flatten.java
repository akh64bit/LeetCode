package ungrouped;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int value;
	Node next;
	Node down;

	public Node(int value) {
		this.value = value;
		next = null;
		down = null;
	}
}

class Newnode {
	int value;
	Newnode next;

	public Newnode(int value) {
		this.value = value;
		next = null;
	}
}

public class Flatten {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.down = null;
		head.next = new Node(2);
		Node current = head.next;
		current.down = new Node(5);
		Node curr = current.down;
		curr.next = new Node(6);
		curr.next.next = null;
		curr.down = new Node(8);
		curr.down.down = null;
		curr.down.next = null;
		current.next = new Node(3);
		current = current.next;
		current.next = new Node(4);
		current = current.next;
		current.next = null;
		current.down = new Node(7);
		current = current.down;
		current.next = null;
		current.down = new Node(9);
		current = current.down;
		current.down = null;
		current.next = null;

		flatten(head);
	}

	public static void flatten(Node head) {
		if (head == null)
			return;
		Queue<Node> q = new LinkedList<>();
		Node curr = head;
		Newnode head1 = new Newnode(curr.value);
		Newnode curr1 = head1;
		if (curr.down != null)
			q.offer(curr.down);
		curr = curr.next;
		while (curr != null || !q.isEmpty()) {
			if (curr != null) {
				curr1.next = new Newnode(curr.value);
				curr1 = curr1.next;
				if (curr.down != null)
					q.offer(curr.down);
				curr = curr.next;
			} else {
				if (!q.isEmpty()) {
					curr = q.poll();
					curr1.next = new Newnode(curr.value);
				}
			}
		}
		curr1.next = null;
		curr1 = head1;
		while (curr1 != null) {
			System.out.println(curr1.value);
			curr1 = curr1.next;
		}
	}
}
