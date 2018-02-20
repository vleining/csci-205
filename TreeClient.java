public class TreeClient {

	public static void main(String[] args){
		BinaryTree one = new BinaryTree(12);
		one.addTree(15);
		one.addTree(6);
		one.addTree(12);
		one.addTree(8);
		System.out.println(one.toString());
	}
}
