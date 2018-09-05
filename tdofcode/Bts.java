package tdofcode;

import java.util.*;
import java.io.*;

public class Bts {
	public static int getHeight(Node root) {
		
		return null;
	}
	
	public static void main(String args[]){
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

	class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Bts().new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}
}
