public class IntTree {
	private IntTreeNode overallRoot;

	public IntTree(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("max: " + max);
		}

		overallRoot = buildTree(1, max);
	}

	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
		}
	}

	public IntTree() {
		overallRoot = null;
	}

	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}


	private IntTreeNode add(IntTreeNode root, int value) {
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (value <= root.data) {
			root.left = add(root.left, value);
		} else {
			root.right = add(root.right, value);
		}
		return root;
	}
	
	public boolean isFull() {
		return isFull(overallRoot);
	}
	
	private boolean isFull(IntTreeNode root) {
		if (root == null) {
			 return true;
		} else if (root.left != null && root.right == null) {  
			return false;
		} else if (root.right != null && root.left == null) {
			return false; 
		} else {
    
			return isFull(root.left) && isFull(root.right);
		}
	} 
	

	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
	}

}
