/*
 Test AVL Tree

 Expected result:

# tree = new AVLTree()
 tree.height() should be -1 >>>  -1
# tree.insert(1)
 tree.height() should be 0 >>>  0
 isAVL(tree) should be true >>>  true

*/

public class TestAVLTree {
   
    public static void main(String[] args) {        

        System.out.println("# tree = new AVLTree()");
        AVLTree tree = new AVLTree();

        System.out.println(" tree.height() should be -1 >>>  "+tree.height());

        System.out.println("# tree.insert(1)");
        tree.insert(1);
        
        System.out.println(" tree.height() should be 0 >>>  "+tree.height());

        System.out.println(" isAVL(tree) should be true >>>  "+isAVL(tree));
    }
    
    private static boolean isAVL(AVLTree tree) {
        return isAVL(tree, tree.getRoot());
     }
 
    private static boolean isAVL(AVLTree tree, AVLTree.Node node) {
         if ( node == null )
             return true;
         int balance = tree.getBalance(node);
         return (balance <= 1 && balance >= -1) && isAVL(tree, node.left) && isAVL(tree, node.right);
     }

}
