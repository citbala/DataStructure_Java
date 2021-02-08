
class BinaryTree{
	Node root;
}

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left= this.right=null;
	}
}

public class HeightOfBinaryTree {
	private static int getHeightOfTree(Node root) {
		int height = 0;
		if(root == null)
			return height;
		height = Math.max(getHeightOfTree(root.left),getHeightOfTree(root.right))+1;
		return height;
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        int height=0;
        height=getHeightOfTree(bt.root);
        System.out.println(height);

	}

	

}
