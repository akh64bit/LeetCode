package ungrouped;

class Tree{
	int val;
	Tree left;
	Tree right;
	public Tree(int val){
		this.val=val;
		left=null;
		right=null;
	}
}

public class SecondLargestInBST {
public static void main(String[] args){
	Tree root = new Tree(4);
	Tree Root = root;
	root.left=new Tree(2);
	root.right=new Tree(6);
	Tree rootleft= root.left;
	Tree rootright = root.right;
	rootleft.left= new Tree(1);
	rootleft.right= new Tree(3);
	rootright.left=new Tree(5);
	rootright.left=new Tree(7);
	
	second(Root);
}

public static void second(Tree root){
	if(root==null)
	{
		System.out.println("no value");
	}
	else if(root.right!=null)
	{
		second(root.right);
	}
	
}
}
