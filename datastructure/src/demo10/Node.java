package demo10;

/**
 * Created by zdw
 * 2019-04-25 16:16.
 */
public class Node implements Comparable<Node> {

    Byte data;

    int weight;

    Node left;

    Node right;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return -(this.weight - o.weight);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }
}
