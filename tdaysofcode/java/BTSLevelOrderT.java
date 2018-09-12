import java.util.LinkedList;
import java.util.Queue;

public class BTSLevelOrderT {
	
	public static void main(String[] args) {
		int[] a = {3,5,4,7,2,1};
		Node root = null;
		for(int i : a) {
			root = insert(root, i);
		}
		levelOrder(root);
	}
	
	static void levelOrder(Node root){
		Queue<BTSLevelOrderT.Node> q = new LinkedList<BTSLevelOrderT.Node>();
		if(root != null) {
			q.add(root);
		}
		while(!q.isEmpty()) {
			Node tree = q.remove();
			System.out.print(tree.data);
			
			if(tree.left != null) q.add(tree.left);
			if(tree.right != null) q.add(tree.right);
		}
	}
		
	
	public static Node insert(Node root, int data) {
		if(root == null) {
			return new BTSLevelOrderT().new Node(data);
		}else {
			Node cur;
			if(data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			}else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			
			return root;
		}
	}
	 
	public class Node {
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			left = right = null;
		}
		
	}

}
