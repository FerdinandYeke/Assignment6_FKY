/**
 * @author Nathan Johnson, Bellarmine University
 * 
 *Edited by: Ferdinand K. Yeke
 */

import java.util.Queue; // import the Queue class
import java.util.LinkedList;
public class Tree {
	
	private int height;
	private int leftChildHeight;
	private int rightChildHeight;
	private int nodeHeight;
	private Node root;
	
	public Tree()
	{
			setRoot(new Node(1));
	}
	
	/**
	 * @return the root
	 */
	
	public Node getRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
	/**
	 * 
	 * @param leftChildHeight gets plugged in into nodeHeight.
	 * @param rightChildHeight gets plugged in into nodeHeight.
	 * 
	 * setTreeHeightCount() gets the height of each node, while the tree part
	 * is for this method to be used until it reaches the end of the tree, that
	 * is, the nodeHeight continuously gets calculated till the end of the tree.
	 * 
	 * nodeHeight calculates the height of each node by the max
	 * height value of the left and right child, plus 1.
	 */
	public void setTreeHeightCount(int leftChildHeight, int rightChildHeight)
	{
		
		this.leftChildHeight =leftChildHeight;
		this.rightChildHeight = rightChildHeight;
		nodeHeight = 1+ Math.max(leftChildHeight, rightChildHeight);
		
	}//setTreeHeightCount() method ends here.

	//returns the root node
	public Node generatePracticeTree(int height)
	{
	   this.height=height;
	   int level=1;
	   //Creating tree breadth-first so
	   //Put the child nodes in a queue
	   Queue <Node> childQ=new LinkedList<Node>();
	   Node pn=root;
	   //Create the children of the root and put some data
	   //Put them in the child queue
	   //int value=pn.getData();
		
	   	childQ.add(pn);
	   	System.out.println ("Root Node value: "+pn.getData());
		int value=pn.getData();
	   		   	
		//Remove the front of the queue
		//Create its children
		//Put them in the queue
		//Data is just parent data+1 or 2 depending on which child
	   while (level<(height) && !childQ.isEmpty())
			 {
				 System.out.println("Level is: "+level);
				 for(int i=1;i<=Math.pow(2,(level-1));i++)
				 {
					 pn=childQ.remove();
					 System.out.println("Parent Node value: "+pn.getData());
					 value++;
					 System.out.println("Adding Left Child: "+(value));
					 pn.setlChild(new Node(value));
					 childQ.add(pn.getlChild());
					 value++;
					 //Left child node height gets incremented by one.
					 leftChildHeight++;
					 System.out.println("Adding Right Child: "+(value));
					 pn.setrChild(new Node(value));
					 childQ.add(pn.getrChild());
					//Right child node height gets incremented by one.
					 rightChildHeight++;
					 
					 /*Sets the height of each node, while doing this till
					  * it reaches the end of the tree, that is, till the
					  * loop is finish.
					  */
					 setTreeHeightCount(leftChildHeight,rightChildHeight);
				 } 
				 level++;System.out.println("Level: "+level);
			 }
			 
		
		return root;
		
	}//Generate practice tree ends here.
	
	/**
	 * 
	 * @return nodeHeight value
	 */
	public int getTreeHeightCount()
	{
		return nodeHeight;
	}//getTreeHeightCount() method ends here.
}//Tree class ends here.
