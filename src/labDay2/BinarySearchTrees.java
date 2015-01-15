package labDay2;

public class BinarySearchTrees {
	
	// atributi
	private Node root;

	// Private class for Node
	private class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

	// Constructor
	public BinarySearchTrees() {
		root = null;
	}

	// function for adding value in tree
	public void add(int value) {
		if(root == null){
			root = new Node(value);
		}
		else {
			add(root, value);
		}

	}
	
	private void add(Node current, int value) {

		// ovo if ne moze ovako raditi, ali ostavili smo da se podsjetimo da nece raditi
		if(current == null){ 
			current = new Node(value);

			return;
		}
		
		if(value <= current.value){
			if(current.left == null){
				current.left = new Node(value);
				return;
			}
			add(current.left, value);
		}
		else {
			if(current.right== null){
				current.right = new Node(value);
				return;
			}
			add(current.right, value);
			
		}
	}
	
	public void print(){
		print(root);
	}
	
	// rekurzija koja sluzi za ispis 
	private void print(Node root){
		if(root == null)
			return;
		print(root.left); // pozvat ce print za left
		System.out.println(root.value);
		print(root.right); // pozvat ce print za right

	}
	
	private boolean contains(Node root, int value){
		if(root == null){
			return false;
		}
		if(root.value == value)
			return true;
		if(root.value > value){
			return contains(root.left, value);
		} else {
			return contains(root.right, value);
		}
		
	}
	
	public boolean  contains(int value){
		return contains(root, value);
	}
}
