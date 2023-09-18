import java.util.ArrayList;
import java.util.Optional;

public class Tree {
    private Optional root;
    private ArrayList<Tree> subtrees;

    public Tree(Optional root, ArrayList<Tree> subtrees) {
        this.root = root;
        if (subtrees.isEmpty()) {
            this.subtrees = new ArrayList<Tree>();
        }
        else {
            this.subtrees = subtrees;
        }
    }
    public boolean isEmpty() {
        return root.isPresent();
    }
    public int length() {
        if (this.isEmpty()) {
            return 0;
        }
        else {
            int len = 1;
            for (Tree subtree : this.subtrees) {
                len += subtree.length();
            }
            return len;
        }
    }
    public int count(Object item) {
        if (this.isEmpty()) {
            return 0;
        }
        else {
            int num = 0;
            if (this.root == item) {
                num += 1;
            }
            for (Tree subtree : this.subtrees) {
                num += subtree.count(item);
            }
            return num;
        }
    }

    @Override
    public String toString() {
        return this.strIndented(0);
    }

    private String strIndented(int depth) {
        if (this.isEmpty()) {
            return "";
        }
        else {
            String s = " ".repeat(depth) + this.root.toString() + "\n";
            for (Tree subtree : this.subtrees) {
                s += subtree.strIndented(depth + 1);
            }
            return s;
        }
    }
    public double average() {
        if (this.isEmpty()) {
            return 0.0;
        }
    }
    private int[] averageHelper() {
        if (this.isEmpty()) {

        }
    }
}
