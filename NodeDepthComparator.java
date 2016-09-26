/*
 * This class allows the Nodes in a priority queue to be sorted by depth.
 * This allows the program to trace the steps needed to solve a puzzle
 * in the proper order (since the depth of a node represents the step)
 */

import java.util.Comparator;

public class NodeDepthComparator implements Comparator<Node>
{
    @Override
    public int compare(Node a, Node b) {
        if(a.getDepth() < b.getDepth())
            return -1;
        else if(a.getDepth() > b.getDepth())
            return 1;
        return 0;       
    }
}
