public class Stack {
	public Node tail = null;
	
	public Stack() {
		this.tail=null;
	}
	
	public void push(Node newNode) {
		if(isEmpty()) {
			tail = newNode;
		} else {
			newNode.setNext(tail);
			tail = newNode;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new Error("Stack is empty");
		}
		Node topNode = tail;
		tail = topNode.getNext();
		return topNode.getValue();
	}
	
	public boolean isEmpty() {
		return tail==null? true : false;
	}
}