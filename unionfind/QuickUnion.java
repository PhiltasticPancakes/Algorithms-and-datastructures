import java.util.Scanner;

public class QuickUnion {
	static int n;
	static int[] p;
	static int m;
	static String command;
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		n = console.nextInt();
		p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = i;
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
		while(!(i == p[i])) {
			i=p[i];
		}
		return i;
	}
	
	public static void Union(int i, int j) {
		int ri = find(i);
		int rj = find(j);
		if(!(ri == rj)) {
			p[ri]=rj;
		}
	}
	

	

}


