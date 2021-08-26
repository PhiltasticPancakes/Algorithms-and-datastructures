
public class Graph {
	Vertex[] veteces;
	int size;
	int[] prev;
	
	public Graph(int n) {
		veteces = new Vertex[n*n];
		this.size = n;
		prev = new int[n*n];
	}
	public void addNode(int key, char val) {
		veteces[key] = new Vertex(val);
		fillNeighbours(key);
		System.out.println("added node at:" + key);
	}
	
	public void fillNeighbours(int key) {
		if(key-1>=0 && !(veteces[key-1] ==null)) {
			addEdge(key, key-1);
		}
		if(key-size>=0 && !(veteces[key-size] == null)) {
			addEdge(key, key-size);
		}
		
	}
	
	public void DFS() {
		
	}
	

	
	public void BFS1(int index) {
		int reachable_ghosts = 0;
		LinkedList neighbours;
		Queue q = new Queue();
		Edge edge;
		int index_dif;
		
		boolean[] visited = new boolean[size*size];
		
		q.enQueue(new Node(index));
		visited[index] = true;
		while(!q.isEmpty()) {
			neighbours = veteces[q.deQueue()].getNeighbours();
			edge = neighbours.getHead();
			while(!(edge==null)) {
				nextIndex = edge.getKey();
				if(visited[index]==true) {
					edge = edge.getNext();
					continue;
				}
				veteces[index].setTrace(0);
				q.enQueue(veteces[edge.getKey()]);
				visited[edge.getKey()]=true;
			}
			
		}
		
		
		
	}
	
	public void addEdge(int a, int b) {
		veteces[a].addNeightbour(b);
		veteces[b].addNeightbour(a);
		
	}
	
	public Vertex[] getVeteces() {
		return veteces;
	}


}
