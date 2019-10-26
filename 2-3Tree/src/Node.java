import java.util.ArrayList;

public class Node {
	
	public	ArrayList<Integer> key=new ArrayList<Integer>();
	public ArrayList<Node> child=new ArrayList<Node>();
	private Node track=null;
	private boolean shift;
	
	Node(int k1)	{		key.add(k1);	shift=false;	}	
	Node(int k1,Node newchild1,Node newchild2)
	{
		key.add(k1);
		child.add(newchild1);
		child.add(newchild2);
		newchild1.track=this;
		newchild2.track=this;
		shift=false;
	}
	public boolean isLeaf()
	{
		boolean temp=false;
		if(child.size()==0) {temp=true;}
		return temp;
	}
	public boolean isFull()
	{
		boolean temp=false;
		if(key.size()>=2) {temp=true;}
		return temp;
	}
	
	
	public void Split()
	{	
		if(!isLeaf())
		{shift=true;
			Node left=new Node(key.get(0),child.get(0),child.get(1));
			Node right=new Node(key.get(2),child.get(2),child.get(3));
			key.remove(0);
			key.remove(1);
			child.removeAll(child);
			child.add(left);
			child.add(right);	
			left.track=this;
			right.track=this;
			left.shift=false;
			right.shift=false;
			
		}
		else
		{	
			Node left=new Node(key.get(0));
			Node right=new Node(key.get(2));
			int temp=key.get(1);
			key.removeAll(key);
			key.add(temp);
			child.add(left);
			child.add(right);	
			left.track=this;
			right.track=this;
			left.shift=false;
			right.shift=false;
			shift=true;
		}

	}
	
	public void push()
	{
			if(!track.isFull())	{	track.shift(); }
			else				{if(track.track!=null)	{track.shift(); track.push();}	}
	}
	
	public void shift()
	{
		if(!isLeaf())
		{
		Node temp = null;
		boolean test=false;
		for(int x =0;x<child.size();x++)	{	if(child.get(x).shift==true) {child.get(x).shift=false;test=true; temp=child.get(x); break;}}
		if(test==true)
		{addkey(temp.key.get(0));
		Node new1 = temp.child.get(0);
		Node new2 = temp.child.get(1);
		addchild(new1);
		addchild(new2);
		new1.track=this;
		new2.track=this;
		child.remove(child.indexOf(temp));
		 }
		if(key.size()==3) { Split();}
			}}
	
	public void modifyInsert(int val)
	{
		boolean duplicate=false;
		for (int x=0;x<key.size();x++)	{if(key.get(x)==val){duplicate = true; break;}}
		if(duplicate==false)
		{if(isLeaf())
		{	
			if(duplicate==false)
			{	if(!isFull())	{	addkey(val); }
				else			
				{	addkey(val);	Split(); 
					if(track!=null)
						{push();}}}
		}
		else
		{	int y=0;
			for(int x =0;x<key.size();x++)	{if(val<key.get(x)) {y=x; break;} else y++;}
			child.get(y).modifyInsert(val);	}}}
	
	public Node search(int val)
	{
		/*
		 * int index=0; while(index < key.size() && val > key.get(index)) index++; if(i
		 * < key.size() && val == key.get(index)) return this; return
		 * child.get(index).search(val);
		 */
		
		
		for(int x=0;x<key.size();x++)
		{	if(val==key.get(x)) 				{return this; }}
		if(!isLeaf())
		{
			for(int x=0;x<key.size();x++)
				if(val<key.get(x)) {					
					return child.get(x).search(val);
				} 
		
			return child.get(key.size()).search(val);
		}
		return null;
		
	}
	
	public void addkey(int val)
	{
		int y=0;
		for(int x =0;x<key.size();x++)
		{
			if(val<key.get(x)) {key.add(x,val); break;}
			else y++;
		}
		if(y==key.size()) {key.add(val);}
	}
	
	public void addchild(Node val)
	{
		int y=0;
		for(int x =0;x<child.size();x++)
		{
			if(val.key.get(0)<child.get(x).key.get(0)) {child.add(x,val); break;}
			else y++;
		}
		if(y==child.size()) {child.add(val);}
	}
}