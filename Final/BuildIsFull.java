//Write a method isFull that returns whether or not a binary tree is full
//(true, if it is, false if otherwise).
//A full binary tree is one in which every 
//node has 0 or 2 children. 

public class buildIsFull {
        public buildIsFullNode nodeRoot;
        public buildIsFull() {
            nodeRoot=null;
        }
        public boolean isFull() {
            return isFull(nodeRoot);
        }
        public static boolean isFull(buildIsFullNode root) {
            if(root==null) {
                return true;
            }
            else {
                return isFull(root.left) && isFull(root.right);
            }
        }
        public buildIsFull(int max) {
            if(max==0) {
                throw new IllegalArgumentException();
            }
            nodeRoot=buildTree(1,max);
        }
        public buildIsFullNode buildTree(int n, int max) {
            if(n>max) {
                return null;
            }
            else {
                return new buildIsFullNode(n, buildTree(2*n,max),buildTree(2*n+1,max));
            }
        }
        public void printPreorder() {
            System.out.print("Preorder: ");
            printPreorder(nodeRoot);
            System.out.println();
        }
        public void printPreorder(buildIsFullNode root) {
            if(root!=null) {
                System.out.print(" "+ root.data);
                printPreorder(root.left);
                printPreorder(root.right);
            }
        }
        public void printInorder() {
            System.out.print("Intorder: ");
            printInorder(nodeRoot);
            System.out.println();
        }
        public void printInorder(buildIsFullNode root) {
            if(root!=null) {
                System.out.print(" " + root.data);
                printInorder(root.left);
                printInorder(root.right);
            }
        }
        public void printPostorder() {
            System.out.print("Postorder: ");
            printPostorder(nodeRoot);
            System.out.println();
        }
        public void printPostorder(buildIsFullNode root) {
            if(root!=null) {
                System.out.print(" " + root.data);
                printPostorder(root.left);
                printPostorder(root.right);
            }
        }
        public void printSideways() {
            printSideways(nodeRoot, 0);
        }
        private void printSideways(buildIsFullNode root, int level) {
            if (root != null) {
                printSideways(root.right, level + 1);
                for (int i = 0; i < level; i++) {
                    System.out.print("    ");
                }
                System.out.println(root.data);
                printSideways(root.left, level + 1);
            }
        }
        public buildIsFullNode insert(buildIsFullNode node, int value) {
            if(node == null) {
                return createNode(value);
            }

            if (value < node.data) {
                node.left = insert(node.left, value);
            } else if (value > node.data){
                node.right = insert(node.right, value);
            }
            return node;
        }

        private buildIsFullNode createNode(int value) {
            buildIsFullNode node = new buildIsFullNode(value);
            node.data = value;
            node.left = null;
            node.right = null;
            return node;
        }

    }
}
