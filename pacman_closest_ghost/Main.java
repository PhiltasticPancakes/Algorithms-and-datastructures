import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		console.nextLine();
		Graph graph = new Graph(n);
		LinkedList pacmen = new LinkedList();
		int ghostCount = 0;
		
		
		String current;
		
		int index = 0;
		for(int i = 0; i<n; i++) {
			current = console.nextLine();
			for(int j = 0; j<n; j++) {
				if(current.charAt(j)=='#') {
					index++;
					continue;
				}
				graph.addNode(index, current.charAt(j));
				
				if(current.charAt(j)=='P') {
					pacmen.insert(index);
				} else if(current.charAt(j)=='G') {
					ghostCount++;
				}
				
				index++;		
			};
		}		
		System.out.println(graph.BFS1(pacmen.getHead().getKey()));
		
//		for(Vertex v: (graph.getVeteces())){
//			if(v==null) {
//				System.out.println('#');
//				continue;
//			}
//			System.out.println(v.getValue());
//		}
		
		
	}
}
