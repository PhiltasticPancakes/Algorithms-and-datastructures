import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		console.nextLine();
		Graph graph = new Graph(n);
		System.out.println(graph.getVeteces().length);
		LinkedList pacmen = new LinkedList();
		
		
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
				}
				index++;		
			};
		}
		
		
	}
}
