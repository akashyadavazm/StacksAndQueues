package queueOperation;

public class QueueLinkedListUC1 {

	public static class Node<T> {
		int data;
		Node<T> next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static class Queue<T> {
		int front;
		public Node<T> head, tail = null;

		public boolean isEmpty() {
			return head == null;
		}

		public void enQueue(int data) {
			Node<T> newNode = new Node<T>(data);
			if (isEmpty()) {
				head = newNode;
				tail = newNode;
				return;

			}
			tail.next = newNode;
			tail = newNode;
		}

	}

	public static void main(String[] args) {
		Queue<Integer> qll = new Queue<Integer>();
		qll.enQueue(56);
		qll.enQueue(30);
		qll.enQueue(70);
	}

}