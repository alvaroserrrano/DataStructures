package linkedList;

public class Node {
	private int data;
	private Node nextNode;
	
	//0-arg constr, 1-arg contr, 2-arg contr
	
	public Node() {
		
	}
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNextNode(Node n) {
		this.nextNode = n;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
}//class
