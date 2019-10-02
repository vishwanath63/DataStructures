package AVL;

public class AVLNode {
	int data;
	AVLNode left;
	AVLNode right;
	int balancefactor;
	AVLNode(int d)
	{
		data=d;
		right=null;
		left=null;
		balancefactor=0;
	}
	
	
	
	public int height() {
		if(this.left == null && this.right == null)
		{
			return 1;
		}
		else if(this.right == null)
		{
			return left.height()+1;
		}
		else if(this.left== null)
		{
			return right.height()+1;
		}
		else
			return Math.max(left.height(),right.height())+1;
	}
	
	public int balance()
	{
		if(this.left==null && this.right==null)
		{
			return 0;
		}
		else if(this.right == null)
		{
			return left.height();
		}
		else if(this.left==null)
		{
			return -1*right.height();
		}
		else
			return left.height()-right.height();
	}
	
	public AVLNode rlc()
	{
		AVLNode lc = left;
		left = lc.right;
		lc.right = this;
		return lc;
	}
	
	public AVLNode rrc()
	{
		AVLNode rc = right;
		right = rc.left;
		rc.left = this;
		return rc;
	}
	
	public AVLNode insert(int key)
	{
		if(key<data)
		{
			if(left==null)
				left = new AVLNode(key);
			else 
				left = left.insert(key);
		}
		else
		{
			if(right==null)
				right = new AVLNode(key);
			else
				right=right.insert(key);
		}
		balancefactor = balance();
		switch(balancefactor) {
			case 2:
				if(left.balancefactor>=0)
					return rlc();
				else 
				{
					left =left.rrc();
					return rlc();
				}
			case -2:
				if(right.balancefactor<=0)
					return rrc();
				else
				{
					right=right.rlc();
					return rrc();
				}
			
	}
		return this;
	}
	
	public void inorder()
	{
		if(left!=null)
		{
			left.inorder();
		}
		System.out.println(data);
		if(right!=null)
		{
			right.inorder();
		}
	}
	
	public void preorder()
	{
		System.out.println(data);
		if(left!=null)
		{
			left.inorder();
		}
		
		if(right!=null)
		{
			right.inorder();
		}
	}
	
	
	
	public void postorder()
	{
		if(left!=null)
		{
			left.inorder();
		}
		
		if(right!=null)
		{
			right.inorder();
		}
		
		System.out.println(data);
	}

}
