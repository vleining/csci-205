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
	public boolean deleteTree (int data){
		TreeNode position = root;
		TreeNode trailer = root;
		boolean side = false;
		while (position != null && position.getData() != data){
			trailer = position;
			if (data> position.getData()){
				position = position.getRight();
				side = true;
			} else {
				position = position.getLeft();
				side = false;
			}
		}
		if (position == null) {
			return false;
		}
		if (!(position.getLeft()!= null && position.getRight()!= null)){
			simpleDelete(position,trailer,side);
			return true;
		}
		TreeNode position1 = position.getRight();
		TreeNode trailer1 = position;
		side = true;
		while(position1.getLeft()!= null){
			trailer1 = position1;
			side = false;
			position1 = position1.getLeft();
		}
		position.setData(position1.getData());
		simpleDelete(position1,trailer1,side);
		return true;
	}

	private void simpleDelete(TreeNode position, TreeNode trailer, boolean side){
		if (position.getLeft()==null && position.getRight()==null){
			if (position == trailer) {
				root = null;
			} else {
				if (side) {
					trailer.setRight(null);
				} else {
					trailer.setLeft(null);
				}
			}
		}
		if (position.getLeft()==null && position.getRight()!= null){
			if (position == trailer) {
				root = position.getRight();
			} else {
				if (side) {
					trailer.setRight(position.getRight());
				} else {
					trailer.setLeft(position.getRight());
				}
			}
		}
		if (position.getLeft()!= null && position.getRight()==null){
			if (position == trailer) {
				root = position.getLeft();
			} else {
				if (side) {
					trailer.setRight(position.getLeft());
				} else {
					trailer.setLeft(position.getLeft());
				}
			}	
		}
	}
		
}
