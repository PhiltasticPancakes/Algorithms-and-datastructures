public class Vertex {
	private char value;
	private Vertex trace;
	private Node next;
	private LinkedList neighbours; 
	private char dir;

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
	
	public void setTrace(Vertex trace) {
		this.trace = trace;
	}
	
	public Vertex getTrace() {
		return trace;
	}
	
	public char getDir() {
		return dir;
	}
	
	public void setDir(char dir) {
		this.dir = dir;
	}
}