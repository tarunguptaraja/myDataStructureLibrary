package myBST;

import java.util.*;

public class myBinarySearchTree{
	
	private static final Scanner sc=new Scanner(System.in);
	
	public static BSTNode createTree() {
		
		BSTNode root=null;
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		
		if(data == -1)return null;
		
		root = new BSTNode(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for " + data);
		root.right=createTree();
		
		return root;
	}
}
