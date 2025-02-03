package Assignment2;
class Graph{
	int count;
	int[][] adj;
	Graph(int ent){
		count=ent;
		adj= new int[count][count];
	}
	public void addDirectedEdge(int src, int dst, int cost) {
		adj[src][dst]=cost;
	}
	public void addDirectedEdge(int src, int dst) {
		addDirectedEdge(src, dst, 1);
	}
	public void addUnDirectedEdge(int src, int dst, int cost) {
		adj[src][dst]=cost;
		adj[dst][src]=cost;
	}
	public void addUnDirectedEdge(int src, int dst) {
		addUnDirectedEdge(src, dst, 0);
	}
	public void show() {
		for(int i=0; i<count; i++){
			for(int j=0; j<count; j++){
				if (adj[i][j]>0)
					System.out.print(adj[i][j]);
				else {
					System.out.print(0);
				}
			}System.out.println();
		}
	}
}
public class Feb3 {
	public static void main(String[] args) {
		Graph ob=new Graph(3);
		ob.addDirectedEdge(0, 1);
		ob.addDirectedEdge(1, 2);
		ob.addDirectedEdge(2, 0);
		ob.show();
	}

}
