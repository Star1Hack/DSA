public class AVLNode {
    protected int data;
    protected AVLNode left;
    protected AVLNode right;

    protected int balanceFactor;

    public AVLNode() { };
    public AVLNode(int d) {
        data = d;
        balanceFactor = 0;
    }

    public void inorder() { ... }
    public void preorder() { ... }
    public void postorder() { ... }
    public boolean search(int key) { ... }
    public boolean isLeaf() { ... }
    public boolean hasOnlyLeft() { ... }
    public boolean hasOnlyRight() { ... }
    public int height() { ... }
    public int max(int a, int b) { ... }

    public int computeBalance() {
        if (isLeaf()) return 0;
        else if (hasOnlyLeft()) return left.height()+1;
        else if (hasOnlyRight()) return -1 * (right.height()+1);
        else	return left.height() - right.height();
    }

    public AVLNode rotateWithLeftChild() {
    	AVLNode lc = left;
    	left = lc.right;
    	lc.right = this;
    	computeBalance(); lc.computeBalance();
    	return lc;
    }

    public AVLNode rotateWithRightChild() {
    	AVLNode rc = right;
    	right = rc.left;
    	rc.left = this;
    	computeBalance(); rc.computeBalance();
    	return rc;
    }

    public AVLNode insert(int key) {
        if (key < data)  { // 1. go leftwards
            if (left == null)   // left is available for insertion
                left = new AVLNode(key);
            else  // left is not available, so delegate insert to left child
                left = left.insert(key);
        }
        else {  // 2. go rightwards
            if (right == null)  // right is available for insertion
                right = new AVLNode(key);
            else  // right is not available, so delegate insert to right child
                right = right.insert(key);
        }
