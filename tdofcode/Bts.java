package tdofcode;

import java.util.*;
import java.io.*;

public class Bts {
	public static int getHeight(Node root) {
		if(root == null) {
			return - 1;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		
	}
	
	public static void main(String args[]){
		
		int[] a = {4,7,1,34,45,6,7,8,3,4,55,4,43,32};
		Node root = null;
		for (int i : a) {
			root=insert(root, i);
		}
		System.out.println(getHeight(root));
	
	}

	class Node {
		Node left, right;
		int data;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			left = right = null;
		}
	}

	public static Node insert(Node root, int data) {
		if(root == null) {
			return new Bts().new Node(data);
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
}
