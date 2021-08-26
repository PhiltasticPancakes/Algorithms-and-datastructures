public class Edge {
		private int key;
		private Edge next;
		
		public Edge(int key) {
			this.key=key;
		}
		
		public void setNext(Edge next) {
			this.next = next;
		}
		
		public int getKey() {
			return key;
		}
		public Edge getNext() {
			return next;
		}
	}