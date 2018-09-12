
public class LinkedLists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,6,5,9,3,1,43,21,57,85};
		Node head = null;
		for (int i : a) {
			head = insert(head, i);
		}
		
		
	}
	
	public static Node removeDuplicates(Node head) {
		
		if ( head == null) {
			return head;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
		
		// !!!!!!!!!!
		return head;
	}
	
	public static  Node insert(Node head,int data) {
		LinkedLists2.Node p = new LinkedLists2().new Node(data);
		if(head == null) {
			head = p;
		}else if(head.next == null) {
			head.next = p;
		}else {
			Node start = head;
			while (start.next != null) {
				start = start.next;
			}
			start.next = p;
		}
		
		return head;
	}
	
	public class Node{
		int data;
		LinkedLists2.Node next;
		public Node(int d) {
			// TODO Auto-generated constructor stub
			this.data = d;
			next = null;
		}
	}
}
