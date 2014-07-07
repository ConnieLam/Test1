/**
 * 
 */
package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lams
 *
 */
public class BinaryTreePreorder {

	/**
	 * 
	 */
	public BinaryTreePreorder() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(1);
		treeNode.right = new TreeNode(2);
		treeNode.right.left = new TreeNode(3);
		BinaryTreePreorder btpre = new BinaryTreePreorder();
		List<Integer> list = btpre.preorderTraversal (treeNode);
		
		for (int val:list){
			System.out.println (val);
		}
		
	}
	
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> addNum = new ArrayList<Integer>();
        
        recursiveTraversal(root,addNum);
        return addNum;
    }
    
    private void recursiveTraversal(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);   // Access the value of current node
        
        recursiveTraversal(root.left, result);  // Traverse the left subtree
        recursiveTraversal(root.right, result); // Traverse the right subtree
    }
}

    
