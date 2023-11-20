/**
 * @author Ferdinand K. Yeke
 *
 */
/*
 * This Depth-First Search class is of type Depth-First Preorder.
 * This class also traverses through the tree in this manner.
 * This class will traverse the tree by first, visiting the root,
 * then  traverse existing subtrees from left to right.
 * 
 * This class uses a Depth First Search implementation for tranversing the
 * tree in a depth-first preorder manner. This uses a recursive method for checking
 * if a node of a tree is a leaf or not, it does this till it finds a leaf(s) on the 
 * left most side of the tree, to the right most side of the tree.
 */
public class DepthFirstSearch extends Tree{
	
	//A Node type variable
	Node root;
	private int numOfNodesVisited = 0;
	private int numOfLeafs = 0;
	
	
	public DepthFirstSearch()
	{
		System.out.println("Call DFS with root node to do a Depth"
				+ " First Search");
	}
	
	/**
	 * 
	 * @param node gets the node from the tree, checks to see if the
	 * node has a left child and a right child. If the node has left
	 * and right children, then it goes to its children and checks if
	 * they also have children. It does this till it reaches a node in
	 * the subtree where it does not have children. This will be labeled
	 * as a "leaf".
	 */
	public void DFS(Node node)
	{
		System.out.println(node.getData());
		
		//Traversing the tree
		/*This could start out as a recursive method to
		 * check the many subtrees till it gets to a node with
		 * no children nodes.
		 */
		
		/*
		 * If getting the root does not have an empty value, proceed
		 * to traverse through the sub trees.
		 */
		if(getRoot()!= null){
		
		//Demo docs start here
			//Visits the left node by getting the lChild
			//Node visitLNode= node.getlChild();
			//Visits the right node by getting the rChild
			//Node visitRNode= node.getrChild();
			
			/*
			if(node.getlChild() != null)
			{
				System.out.println("Value of current visted left"
						+ " child node: "+node.getlChild());
				DFS(node);
				numOfNodesVisited++;
			}
			
			else if(node.getrChild() != null)
			{
				System.out.println("Value of current visted right"
						+ " child node: "+node.getlChild());
				DFS(node);
				numOfNodesVisited++;
			}
			
			else
			{
				
				
			}
			*/
			//Demo docs end here
			
			/*Checks IF the specific node has no children (left AND right),
			 *then label the node as a "leaf", while incrementing the leaf
			 *count & numOfNodes visited.
			 */
			if(node.getlChild() == null && node.getrChild() == null)
			{
			
				System.out.println("Node: "+node.getData()+" is a leaf.");
				numOfLeafs++;
				System.out.println("Curret leaf count: "+numOfLeafs);
				
				/*numOfNodesVisited still gets incremented since we are 
				 * checking this node, even though the node here has no
				 * children.
				 */
				numOfNodesVisited = numOfNodesVisited+1;
				System.out.println("Total number of nodes visited: "
						+ ""+numOfNodesVisited);
				
			}
			
			/*
			 * Else if the node HAS children nodes (left AND right), 
			 * then, get the value for both of them, then proceed to the left side 
			 * children nodes and repeat the same process until
			 * one of them has no children (IF THEY HAVE ANY). After that,
			 * it goes/"pops" up to the right hand part and repeats the process 
			 * like the left side until the right reaches a leaf node.
			 * 
			 */
			else
			{
				System.out.println("Value of currently visted left"
						+ " child node: "+node.getlChild().getData());
				System.out.println("Value of currently visted right"
						+ " child node: "+node.getrChild().getData());
				numOfNodesVisited+= 2;
				/*Increments nodes visited by 2 since it is checking the 
				 * left & right children nodes.
				 */
					
				/*
				 * After getting the left and right child nodes, the method calls
				 * itself to proceed to the left child node and right child node.
				 */
				DFS(node.getlChild());
				DFS(node.getrChild());
			}
		
		}//Big if block ends here.
			
	}//DFS method ends here.

}//DepthFirstSearchClass ends here.
