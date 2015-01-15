package labDay2;

public class QueueStack2 {
	public static void main(String[] args) {
	
	System.out.println("-----------Queue--------");
	PriorityQ test2 = new PriorityQ();
	test2.push(2, 8);
	test2.push(4,8 );
	test2.push(6, 7);
	test2.push(2, 9);
	test2.push(3, 9);
	
	
	System.out.println(test2.pop());
	System.out.println(test2.pop());
	System.out.println(test2.pop());
	System.out.println(test2.pop());
	
	
	System.out.println("-----------Binary--------");
	BinarySearchTrees bs = new BinarySearchTrees();
	bs.add(20);
	bs.add(25);
	bs.add(15);
	bs.add(30);
	bs.add(10);
	bs.print();
	System.out.println(bs.contains(15));
	
	
}
}
