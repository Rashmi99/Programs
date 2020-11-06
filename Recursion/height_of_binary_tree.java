package recursion;
class Node{
	int data;
	Node left;
	Node right;		
	Node(int data){this.data=data;left=null;right=null;}
}
public class height_of_binary_tree {
	Node root;	
	int find_height(Node root) {
		if(root==null)return 0;
		return 1+Math.max(find_height(root.left), find_height(root.right));
	}
	
	public static void main(String[] args) {
		height_of_binary_tree t=new height_of_binary_tree();
		t.root=new Node(10);
		t.root.left=new Node(20);
		t.root.right=new Node(30);
		t.root.left.left=new Node(40);
		t.root.left.left.left=new Node(50);
		System.out.println("Max height of tree is "+t.find_height(t.root));
		

	}

}
