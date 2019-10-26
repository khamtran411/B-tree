public class Tree {
	
	public Node root;
	public Tree() {
		root = null;
	}
	public void insert(int data) {
		if (root == null) {
			root = new Node(data);
			
		}
		else {
			root.modifyInsert(data);
			root.shift();
		}
	}
	
	public int size(int val)
	{	int size=0,count=0;
		Node temp=root.search(val);
		if(temp==null) {return 0;}
		if(!temp.isLeaf()){
		for(int x=0;x<temp.key.size();x++)
		{
			size+=size(temp.child.get(x).key.get(0));
			count++;
		}
		size+=size(temp.child.get(count).key.get(0));
		size+=temp.key.size();} 
		else{size=temp.key.size();}	
		
		
	return size;
	}
}