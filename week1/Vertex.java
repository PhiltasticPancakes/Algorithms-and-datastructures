public class Vertex {
	private char value;
	private Node next;
	private LinkedList neighbours; 
	private char trace;

	public Vertex(char val) {
		this.value=val;
		this.next=null;
		this.neighbours= new LinkedList();
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public char getValue() {
		return value;
	}
	
	public void addNeightbour(int key) {
		neighbours.insert(key);
	}
	
	public LinkedList getNeighbours() {
		return neighbours;
	}
	
	public void setTrace(char trace) {
		this.trace = trace;
	}
	
	public char getTrace() {
		return trace;
	}
}