import static org.junit.Assert.*;

import org.junit.Test;


public class GivenTreeTests
{

   @Test
   public void singleNodeTree()
   {
      Tree t = new Tree();
      t.insert(9);
      
      assertEquals(1, t.size(9));
      assertEquals(0, t.size(8));
      assertEquals(0, t.size(10));
      
      t.insert(15);
      assertEquals(2, t.size(9));
      assertEquals(0, t.size(8));
      assertEquals(0, t.size(10));
      assertEquals(2, t.size(15));
      assertEquals(0, t.size(18));

      t = new Tree();
      t.insert(15);
      t.insert(9);
      assertEquals(2, t.size(9));
      assertEquals(0, t.size(8));
      assertEquals(0, t.size(10));
      assertEquals(2, t.size(15));
      assertEquals(0, t.size(18));

   }

   @Test
   public void oneSplitLeft()
   {
      Tree t = new Tree();
      t.insert(9);
      t.insert(15);
      t.insert(1);
      
      assertEquals(3, t.size(9));
      assertEquals(1, t.size(15));
      assertEquals(0, t.size(17));
     

      assertEquals(1, t.size(1));
      assertEquals(0, t.size(0));
      assertEquals(0, t.size(3));
   }
   
   @Test
   public void oneSplitRight()
   {
      Tree t = new Tree();
      t.insert(1);
      t.insert(9);
      t.insert(15);
      
      assertEquals(3, t.size(9));
      assertEquals(1, t.size(15));
      assertEquals(0, t.size(17));
      assertEquals(0, t.size(11));

      assertEquals(1, t.size(1));
      assertEquals(0, t.size(0));
      assertEquals(0, t.size(3));
   }

   @Test
   public void oneSplitmid()
   {
      Tree t = new Tree();
      t.insert(1);
      t.insert(15);
      t.insert(9);
      
      assertEquals(3, t.size(9));
      assertEquals(1, t.size(15));
    

      assertEquals(1, t.size(1));
      assertEquals(0, t.size(0));
      assertEquals(0, t.size(3));
   }

   
   @Test
   public void testDuplicates()
   {
      Tree t = new Tree();
      t.insert(1);
      t.insert(9);
      t.insert(15);
      t.insert(13);
      t.insert(20);
      t.insert(7);
      t.insert(4);
      t.insert(1);
      t.insert(9);
      t.insert(15);
      t.insert(1);
      t.insert(9);
      t.insert(15);
      t.insert(13);
      t.insert(20);
      t.insert(7);
      t.insert(4);
      t.insert(13);
      t.insert(20);
      t.insert(7);
      t.insert(4);

     
      assertEquals(3, t.size(4));
      assertEquals(3, t.size(15));

      assertEquals(0, t.size(12));
      assertEquals(1, t.size(13));
      assertEquals(0, t.size(14));
      assertEquals(0, t.size(19));
      assertEquals(1, t.size(20));
      assertEquals(0, t.size(21));

      assertEquals(1, t.size(1));
      assertEquals(0, t.size(0));
      assertEquals(0, t.size(3));

      assertEquals(0, t.size(6));
      assertEquals(1, t.size(7));
      assertEquals(0, t.size(8));

   }
	@Test
	public void testInsert() 
	{
	System.out.println("Test Insert3________________");
	Tree t=new Tree();
	t.insert(1);
	t.insert(2);
	t.insert(3);
	t.insert(4);
	t.insert(5);
	t.insert(6);
	t.insert(7);
	t.insert(8);
	t.insert(8);
	t.insert(9);
	t.insert(10);
	t.insert(11);
	t.insert(12);
	t.insert(13);
	t.insert(14);
	t.insert(15);
	t.insert(16);
	t.insert(17);
	t.insert(18);
	t.insert(5);
	t.insert(6);
	t.insert(7);
	t.insert(8);
	t.insert(8);
	t.insert(9);
	t.insert(10);
	t.insert(19);
	t.insert(20);
	t.insert(21);
	t.insert(22);
	t.insert(23);
	t.insert(24);
	t.insert(25);
	t.insert(26);
	t.insert(27);
	t.insert(28);
	t.insert(29);
	t.insert(30);
	t.insert(31);
	t.insert(32);
	

	
	
	t.insert(16);
	assertEquals(0,t.size(200));
	assertEquals(7,t.size(20));
	assertEquals(7,t.size(20));
	assertEquals(3,t.size(6));
	assertEquals(3,t.size(10));
	assertEquals(1,t.size(3));
	assertEquals(8,t.size(28));
	assertEquals(32,t.size(16));
	assertEquals(7,t.size(20));
	assertEquals(7,t.size(20));
	assertEquals(3,t.size(6));
	assertEquals(15,t.size(8));
	assertEquals(1,t.size(3));
	assertEquals(8,t.size(28));
	assertEquals(32,t.size(16));
	}
	
	@Test
	public void testprint() 
	{
	System.out.println("Test Print________________");
	Tree t=new Tree();
	t.insert(1);
	t.insert(2);
	t.insert(3);
	t.insert(4);
	t.insert(5);
	t.insert(6);
	t.insert(7);
	t.insert(8);
	t.insert(8);
	t.insert(9);
	t.insert(10);
	t.insert(11);
	t.insert(12);
	t.insert(13);
	t.insert(14);
	t.insert(15);
	t.insert(16);
	t.insert(17);
	t.insert(18);
	t.insert(10);
	t.insert(19);
	t.insert(20);
	t.insert(21);
	t.insert(22);
	t.insert(23);
	t.insert(24);
	t.insert(25);
	t.insert(26);
	t.insert(27);
	t.insert(28);
	t.insert(29);
	t.insert(30);
	t.insert(31);
	System.out.println("0:  "+t.root.key.get(0));
	System.out.println("1:  "+t.root.child.get(0).key.get(0));
	System.out.println("2:  "+t.root.child.get(1).key.get(0));
	System.out.println("3:  "+t.root.child.get(0).child.get(0).key.get(0));
	System.out.println("4:  "+t.root.child.get(0).child.get(1).key.get(0));
	System.out.println("5:  "+t.root.child.get(1).child.get(0).key.get(0));
	System.out.println("6:  "+t.root.child.get(1).child.get(1).key.get(0));
	System.out.println("7:  "+t.root.child.get(0).child.get(0).child.get(0).key.get(0));
	System.out.println("8:  "+t.root.child.get(0).child.get(0).child.get(1).key.get(0));
	System.out.println("9:  "+t.root.child.get(0).child.get(1).child.get(0).key.get(0));
	System.out.println("10: "+t.root.child.get(0).child.get(1).child.get(1).key.get(0));
	System.out.println("11:  "+t.root.child.get(1).child.get(0).child.get(0).key.get(0));
	System.out.println("12:  "+t.root.child.get(1).child.get(0).child.get(1).key.get(0));
	System.out.println("13:  "+t.root.child.get(1).child.get(1).child.get(0).key.get(0));
	System.out.println("14:  "+t.root.child.get(1).child.get(1).child.get(1).key.get(0));
	System.out.println("15:  "+t.root.child.get(0).child.get(0).child.get(0).child.get(0).key.get(0));
	System.out.println("16:  "+t.root.child.get(0).child.get(0).child.get(0).child.get(1).key.get(0));
	System.out.println("17:  "+t.root.child.get(0).child.get(0).child.get(1).child.get(0).key.get(0));
	System.out.println("18:  "+t.root.child.get(0).child.get(0).child.get(1).child.get(1).key.get(0));
	System.out.println("19:  "+t.root.child.get(0).child.get(1).child.get(0).child.get(0).key.get(0));
	System.out.println("20:  "+t.root.child.get(0).child.get(1).child.get(0).child.get(1).key.get(0));
	System.out.println("21:  "+t.root.child.get(0).child.get(1).child.get(1).child.get(0).key.get(0));
	System.out.println("22:  "+t.root.child.get(0).child.get(1).child.get(1).child.get(1).key.get(0));
	System.out.println("23:  "+t.root.child.get(1).child.get(0).child.get(0).child.get(0).key.get(0));
	System.out.println("24:  "+t.root.child.get(1).child.get(0).child.get(0).child.get(1).key.get(0));
	System.out.println("25:  "+t.root.child.get(1).child.get(0).child.get(1).child.get(0).key.get(0));
	System.out.println("26:  "+t.root.child.get(1).child.get(0).child.get(1).child.get(1).key.get(0));
	System.out.println("27:  "+t.root.child.get(1).child.get(1).child.get(0).child.get(0).key.get(0));
	System.out.println("28:  "+t.root.child.get(1).child.get(1).child.get(0).child.get(1).key.get(0));
	System.out.println("29:  "+t.root.child.get(1).child.get(1).child.get(1).child.get(0).key.get(0));
	System.out.println("30:  "+t.root.child.get(1).child.get(1).child.get(1).child.get(1).key.get(0));
	}

	
	@Test
	public void testshift() 
	{	
		Node n = new Node(1);
		n.addkey(2);
		n.addkey(3);
		n.Split();
		n.child.get(0).addkey(9);
		n.child.get(0).addkey(11);
		n.child.get(0).Split();
		n.shift();
		n.modifyInsert(12);
		n.modifyInsert(13);
		n.modifyInsert(4);
		n.modifyInsert(5);
		n.modifyInsert(6);
		n.modifyInsert(7);
		System.out.println("Test shift________________");
		System.out.println("1: "+n.key.get(0));
		System.out.println("1: "+n.key.get(1));
		System.out.println("1: "+n.child.get(0).key.get(0));
		System.out.println("1: "+n.child.get(1).key.get(0));
		System.out.println("1: "+n.child.get(2).key.get(0));
		System.out.println("1: "+n.child.get(1).child.get(0).key.get(0));
		System.out.println("1: "+n.child.get(1).child.get(1).key.get(0));
		System.out.println("1: "+n.child.get(2).child.get(0).key.get(0));
		System.out.println("1: "+n.child.get(2).child.get(1).key.get(0));

	}
	

}