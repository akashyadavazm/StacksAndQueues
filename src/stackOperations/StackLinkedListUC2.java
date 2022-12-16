package stackOperations;

public class StackLinkedListUC2 {

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

		public int pop() {
			if (isEmpty()) {
				System.out.println("Empty Stack");
				return -1;

			}
			int top = head.data;
			head = head.next;
			return top;

		}

		public int peek() {
			if (isEmpty()) {
				System.out.println("Empty Stack");
				return -1;
			}
			return head.data;

		}

	}

	public static void main(String[] args) {
		Stack<Integer> sll = new Stack<Integer>();
		sll.push(56);
		sll.push(30);
		sll.push(70);
		System.out.println("Top of the Stack: " + sll.peek());
		System.out.println("Pop the top Element: " + sll.pop());
		System.out.println("Top of the Stack: " + sll.peek());
		System.out.println("Pop the top Element: " + sll.pop());
		System.out.println("Top of the Stack: " + sll.peek());
		System.out.println("Pop the top Element: " + sll.pop());
		System.out.println("Top of the Stack: " + sll.peek());
		while (!sll.isEmpty()) {
			System.out.println(sll.peek());
			sll.pop();
		}
	}

}
