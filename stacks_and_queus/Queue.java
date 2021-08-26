public class Queue {
	public Node tail = null;
	public Node head = null;
	

	public Queue() {
		this.tail=null;
	}
	
	public void enQueue(Node newNode) {
		if(isEmpty()) {
			tail = newNode;
			head = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			throw new Error("Queue is empty");
		}
		Node exitNode = head;
		head = head.getNext();
		return exitNode.getKey();
	}
	
	public boolean isEmpty() {
		return head==null? true : false;
	}
}