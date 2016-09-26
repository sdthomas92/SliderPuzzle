/**
 * This class stores the puzzle state, parent node, action taken to get from
 * p to the current node, cost so far, estimated cost to get to the goal,
 * total cost (cost so far + estimated cost), and depth. This particular node
 * class is designed to work for A* Searches, since the total cost is estimated
 * from the addition of the cost so far and estimated cost.
 */

public class Node implements Comparable<Node>
{  
    private final int SIZE = 3;
    
    public char[][] state;
    private Node parent;
    private Action action;
    private int costSoFar, estimatedCost, totalCost, depth;
    
    
    public Node(char[][] s, Node p, Action a, int c, int e, int d) {
        state = new char[SIZE][SIZE];
        setState(s);
        parent = p;
        action = a;
        costSoFar = c;
        estimatedCost = e;
        totalCost = c + e;
        depth = d;
    } 
    
    //This constructor is used for generating the root node (which represents
    //the initial state of the puzzle).
    public Node(char[][] s, int e) {
        state = new char[SIZE][SIZE];
        setState(s);
        parent = null;
        action = null;
        costSoFar = 0;
        estimatedCost = e;
        totalCost = e;
        depth = 0;
    }
    
    public void recalculateEstimatedCost(int e) {
        estimatedCost = e;
        totalCost = costSoFar + e;
    }
    
    public Node parent() {
        return parent;
    }
    
    public int getCostSoFar() {
        return costSoFar;
    }
    
    public int getTotalCost() {
        return totalCost;
    }
    
    public int getEstimatedCost() {
        return estimatedCost;
    }
    
    public int getDepth() {
        return depth;
    }
    
    public Node getParent() {
        return parent;
    }
    
    public Action getAction() {
        return action;
    }
   
    private void setState(char[][] s) {
        for(int i = 0; i < state.length; i++) {
            for(int j = 0; j < state[i].length; j++)
                state[i][j] = s[i][j];
        }
    }
    
    public Node copy() {
        return new Node(this.state, this.parent, this.action, this.costSoFar, 
                        this.estimatedCost, this.depth);
    }
    
    //This method allows nodes placed in a priority queue to automatically be
    //sorted by total cost, or cost so far + estimated cost. This allows this
    //Node class to be used primarily for A* Searches.
    @Override
    public int compareTo(Node n) {
        if(this.totalCost < n.totalCost)
            return -1;
        if(this.totalCost > n.totalCost)
            return 1;
        return 0;
    }
    
    public void print() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++)
                System.out.print(state[i][j] + "\t");
            System.out.println();
        }
        
        System.out.println("\nAction: " + action);
        System.out.println("g(n): " + costSoFar);
        System.out.println("h(n): " + estimatedCost);
        System.out.println("g(n) + h(n): " + totalCost);
        System.out.println("Depth: " + depth);
    }
}
