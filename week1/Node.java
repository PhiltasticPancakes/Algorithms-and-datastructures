public class Node {
	private int key;
	private Node next;

	public Node(int key) {
		this.key = key;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getKey() {
		return key;
	}
	
	
}