package myBST;

public class Traversal {

	public static void inOrder(BSTNode root) {
		if(root==null)return;
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public static void preOrder(BSTNode root) {
		if(root==null)return;

		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(BSTNode root) {
		if(root==null)return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
}
