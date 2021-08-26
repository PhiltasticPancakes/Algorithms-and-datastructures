import java.util.Scanner;

public class WeightedUnion {
	static int n;
	static int[] p, sz;
	static int m;
	static String command;
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		n = console.nextInt();
		p = new int[n];
		sz = new int[n];

		for(int i = 0; i < n; i++) {
			p[i] = i;
			sz[i] = 1;
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
		int j = i;
		int k;
		while(!(i == p[i])) {
			i=p[i];
		}
		while(!(j == p[j])) {
			k = j;
			j=p[j];
			p[k] = i;
		}
		
		return i;
	}
	
	public static void Union(int i, int j) {
		int ri = find(i);
		int rj = find(j);
		if(!(ri == rj)) {
			if(sz[ri] >= sz[rj]) {
				p[rj] = ri;
				sz[ri] += sz[rj];
			} else {
				p[ri] = rj;
				sz[rj] += sz[ri];
			}
		}
	}
	

	

}


