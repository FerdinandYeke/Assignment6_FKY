/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 *Edited by Ferdinand K. Yeke
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		
		//Gets the height of the tree from the Tree instance.
		System.out.println("The height of the tree is: "
				+ ""+aTree.getTreeHeightCount());
	}

}