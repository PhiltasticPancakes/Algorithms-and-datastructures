
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
	
	public String returnTrace(Vertex end) {
		String s = "";
		s=end.getDir() + s;
		end = end.getTrace();
		while(!(end.getTrace()==null)) {
			s=end.getDir() + " " + s;
			end = end.getTrace();
		}
		return s + " ";
	}

	
	public String BFS1(int index) {
		LinkedList neighbours;
		Queue q = new Queue();
		Edge edge;
		int index_dif, nextKey;
		char dir;
		
		boolean[] visited = new boolean[size*size];
		
		q.enQueue(new Node(index));
		visited[index] = true;
		while(!q.isEmpty()) {
			index = q.deQueue();
			neighbours = veteces[index].getNeighbours();
			edge = neighbours.getHead();
			while(!(edge==null)) {
				nextKey = edge.getKey();
				if(visited[nextKey]==true) {
					edge = edge.getNext();
					continue;
				}
				
				index_dif=index-nextKey;
				if(index_dif==1) {
					dir = 'W';
				} else if (index_dif==-1){
					dir = 'E';
				} else if (index_dif==-size){
					dir = 'S';
				} else {
					dir = 'N';
				}
		
				veteces[nextKey].setTrace(veteces[index]);
				veteces[nextKey].setDir(dir);
				if(veteces[nextKey].getValue()=='G') {
					return returnTrace(veteces[nextKey]);
				}
				
				q.enQueue(new Node(nextKey));
				visited[nextKey]=true;
				edge=edge.getNext();
			}
			
		}

		return null;

		
		
		
	}
	
	public void addEdge(int a, int b) {
		veteces[a].addNeightbour(b);
		veteces[b].addNeightbour(a);
		
	}
	
	public Vertex[] getVeteces() {
		return veteces;
	}


}
