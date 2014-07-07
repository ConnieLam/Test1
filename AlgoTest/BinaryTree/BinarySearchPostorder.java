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
public class BinarySearchPostorder {

	/**
	 * 
	 */
	public BinarySearchPostorder() {
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
		BinarySearchPostorder btpre = new BinarySearchPostorder();
		List<Integer> list = btpre.postorderTraversal (treeNode);
		
		for (int val:list){
			System.out.println (val);
		}
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		
		List<Integer> list = new ArrayList<Integer>();
		postOrderTraversal(root,list);
		return list;
		
        
    }
	
	private void postOrderTraversal (TreeNode node , List<Integer> nlist)
	{	
		if (node ==null) return ;
		
		postOrderTraversal(node.left,nlist);
		postOrderTraversal(node.right,nlist);
		nlist.add(node.val);
		
		
	}

}

