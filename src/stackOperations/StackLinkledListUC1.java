package stackOperations;

public class StackLinkledListUC1 {

	public static class Node<T> {
		int data;
		Node<T> next;

		public Node(int data) {
			this.data = data;
		}

	}

	public static class Stack<T> {
		public Node<T> head = null;

		public boolean isEmpty() {
			return head == null;
		}

		public void push(int data) {
			Node<T> newNode = new Node<T>(data);
			if (isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;

		}

	}

	public static void main(String[] args) {
		Stack<Integer> sll = new Stack<Integer>();
		sll.push(56);
		sll.push(30);
		sll.push(70);
	}
}
