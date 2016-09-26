/*
 * This class defines the TestCase object, which stores a solution Node that
 * results from an A* Search, total number of nodes generated to find that
 * result, the depth at which that node was, whether or not the first or second
 * heuristic function was used to find that solution, and the amount of time
 * taken to find that solution. This class is used when displaying the solution
 * analytics of multiple solutions.
 */

public class TestCase implements Comparable<TestCase>
{
    private Node goal;
    private int numberOfNodes, depth;
    private boolean h1;
    private long time;
    
    public TestCase(Node g, int n, int d, boolean h, long t) {
        goal = g;
        numberOfNodes = n;
        depth = d;
        h1 = h;
        time = t;
    }
    
    public int getNumberOfNodes() {
        return numberOfNodes;
    }
    
    public int getDepth() {
        return depth;
    }
    
    public boolean getH1() {
        return h1;
    }
    
    public long getTime() {
        return time;
    }
    
    @Override
    public int compareTo(TestCase n) {
        if(this.depth < n.depth)
            return -1;
        if(this.depth > n.depth)
            return 1;
        return 0;
    }
}
