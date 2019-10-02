package AVL;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree o1 = new AVLTree();
		o1.insert(20);
		o1.insert(25);
		o1.insert(35);
		//o1.insert(10);
		//o1.insert(5);
		o1.inorder();
		System.out.println("_____________________");

		o1.postorder();
		System.out.println("_____________________");

		o1.preorder();
	}

}
