
public class LinkedList {
	private Edge head;
	
	public Edge search(char k) {
		Edge x = head;
		while(!(x.equals(null)) && !(x.getKey()==k)) {
			x = x.getNext();
		}
		return x;
	}
	
	public void insert(int key) {
		Edge x = new Edge(key);
		x.setNext(head);
		head = x;
	}
	
	public Edge getHead() {
		return head;
	}
	
	
	public String toString() {
		String s = "";
		Edge current = head;
		s+=current.getKey();
		while(!(current.getNext() == null)) {
			current =current.getNext();
			s+=" " + current.getKey();
		}
		return s;
	}
	
}
