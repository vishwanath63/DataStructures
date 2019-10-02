package AVL;

public class AVLTree {
	AVLNode root;
	public AVLNode insert(int key)
	{
		if(root == null)
		{
			root = new AVLNode(key);
			return root;
		}
		else return root=root.insert(key);
	}
	
	public void inorder()
	
	{
		if(root == null)
		{
			System.out.println("EMPTY");
		}
		else
			root.inorder();
	}
	
	public void preorder()
	
	{
		if(root == null)
		{
			System.out.println("EMPTY");
		}
		else
			root.preorder();
	}

	public void postorder()

{
	if(root == null)
	{
		System.out.println("EMPTY");
	}
	else
		root.postorder();
}
}
