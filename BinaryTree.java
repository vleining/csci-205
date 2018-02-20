public class BinaryTree {

	private TreeNode root;

	public BinaryTree (){
		root = null;
	}

	public BinaryTree (int data){
		TreeNode temp = new TreeNode(data);
		root = temp;
	}

	public void addTree(int data){
		TreeNode temp = new TreeNode(data);
		if (root == null) {
			root = temp;
		} else {
			TreeNode pos = root;
			boolean done = false;
			while (!done) {
				if (data < pos.getData()){
					if (pos.getLeft() == null){
						pos.setLeft(temp);
						done = true;
					} else {
						pos = pos.getLeft();
					}
				} else {
					if (pos.getRight() == null){
						pos.setRight(temp);
						done = true;
					} else 	{
						pos = pos.getRight();
					}
				}
			}
		}
	}
	public String toString(){
		return toString(root);
	}
	private String toString(TreeNode pos){
		if (pos ==null){
			return "";
		}
		String one = toString(pos.getLeft());
		String two = toString(pos.getRight());
		String out = "";
		if (one.equals("")) {
			out = "" +pos.getData();
		} else {
			out = one + ", "+pos.getData();
		}
		if (two.equals("")) {
			return out;
		} 
		return out+ ", "+two;
	}
}
