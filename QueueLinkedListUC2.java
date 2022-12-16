package queueOperation;

public class QueueLinkedListUC2 {

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

		public int deQueue() {
			if (isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			front = head.data;
			if (head == tail) {
				tail = null;
			}
			head = head.next;
			return front;
		}

		public int peek() {
			if (isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return head.data;

		}

	}

	public static void main(String[] args) {
		Queue<Integer> qll = new Queue<Integer>();
		qll.enQueue(56);
		qll.enQueue(30);
		qll.enQueue(70);
		System.out.println("Rear of the Queue: " + qll.peek());
		System.out.println(qll.deQueue());
		System.out.println("Rear of the Queue: " + qll.peek());
		System.out.println(qll.deQueue());
		System.out.println("Rear of the Queue: " + qll.peek());
		System.out.println(qll.deQueue());

		System.out.println("Rear of the Queue: " + qll.peek());

		while (!qll.isEmpty()) {
			System.out.print(qll.peek() + "-> ");
			qll.deQueue();
		}

	}

}
