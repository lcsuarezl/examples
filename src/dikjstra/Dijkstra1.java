package dikjstra;

public class Dijkstra1 {

    public int size;
    public int distance[] = new int[10];
    public int cost[][] = new int[10][10];


    public Dijkstra1(int size) {
        this.distance = new int[size];
        this.cost = new int[size][size];
        this.size = size;
    }

    public void calc(int size, int source) {
        Boolean flag[] = new Boolean[size];
        int minpos = 1, c, minimum;
        for (int i = 0; i < size; i++) {
            flag[i] = false;
            this.distance[i] = this.cost[source][i];
        }
        flag[source] = true;
        c = 0;
        while (c < size) {
            System.out.println("Ciclo con c = "+c);
            minimum = 999;
            printDistance();
            //Este ciclo debería encontrar la distancia mas corta al siguiente nodo
            for (int k = 0; k <size; k++) {
                //System.out.println(this.distance[k]+" < "+minimum+" && "+!flag[k]);
                if (this.distance[k] < minimum && !flag[k]) {
                    minimum = this.distance[k];
                    minpos = k;
                }
            }
            System.out.println("minimum ["+minimum+"] minPos["+minpos+"]");
            printDistance();
            flag[minpos] = true;
            c++;
            for (int i = 0; i <size; i++) {
                //distancia minima desde el nodo actual mas la distancia
                if (!flag[i] && this.distance[minpos] + this.cost[minpos][i] < this.distance[i])
                    this.distance[i] = this.distance[minpos] + this.cost[minpos][i];
            }

        }

    }

    public void printGraph() {
        System.out.println("Graph: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(this.cost[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void printDistance() {
        System.out.println("Distance: ");
        for (int j = 0; j < size; j++) {
            System.out.print(this.distance[j] + "\t");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int graph[][] = new int[][]{
                {0, 3, 0, 7},
                {3, 0, 4, 2},
                {0, 4, 0, 5},
                {7, 2, 5, 0},
        };
        int size = 4;
        Dijkstra1 dijkstra = new Dijkstra1(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    if (graph[i][j] == 0) {
                        graph[i][j] = 999;
                    }
                }
            }
        }
        dijkstra.cost = graph;
        dijkstra.printGraph();
        dijkstra.calc(4,2);

    }
}
