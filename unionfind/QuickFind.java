import java.util.Scanner;

public class QuickFind {
	static int n;
	static int[] id;
	static int m;
	static String command;
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		n = console.nextInt();
		id = new int[n];
		for(int i = 0; i < n; i++) {
			id[i] = i;
		}
		m = console.nextInt();
		while(m > 0) {
			command = console.next();
			if(command.equals("F")) {
				System.out.println(find(console.nextInt()));
			} else if(command.equals("U")) {
				Union(console.nextInt(), console.nextInt());
			}
			m--;
			
		}
	}
	
	public static int find(int i) {
		return id[i];
	}
	
	public static void Union(int i, int j) {
		int iID = find(i);
		int jID = find(j);
		if(!(iID == jID)) {
			for(int k = 0; k<n; k++) {
				if(id[k] == iID) {
					id[k] = jID;
				}
			}
		}
	}
	

	

}


