package ungrouped;

public class HeightTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(Height(Root));
	}
	
	public static int Height(Tree root)
	{
		if(root==null)
			return 0;
		else
		{
			int l = Height(root.left);
			int r = Height(root.right);
			return Math.max(l, r)+1;
		}
		
	}

}
