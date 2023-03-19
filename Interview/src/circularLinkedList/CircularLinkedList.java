package circularLinkedList;


//
////10, 12, 5, 6, 7, 13
//public class CircularLinkedList {
//	public static void main(String[] args) throws Exception{
//		LinkedList<Integer> linkedList = new LinkedList<>();
//		linkedList.insertNode(10);
//		linkedList.insertNode(7);
//		 linkedList.insertNode(5);
//		 linkedList.insertNode(6);
//		 linkedList.insertNode(17);
//		 linkedList.insertionAtBeginning(13);
//		System.out.println(linkedList);
//		
//		System.out.println(linkedList.deleteNode(0));
////		// System.out.println(linkedList);
////
////		// System.out.println(linkedList.deleteElement(17));
//		System.out.println(linkedList);
//	}
//	
//}
public class CircularLinkedList<T>{
	long lengthOfLinkedList=0;
	private Node head;
	Node CurNode;
	// 10 -> 12 -> 5 -> 6 -> 7 -> 13
  //  |                          |
  //   -------------------------- 
	
	
	public T getnextNode() {
		if(CurNode==null) {
			CurNode=head;
		
		}else {
			CurNode=CurNode.nextNode;
		}
		
//		if(CurNode.equals(null)) {
//			
//			return (T) head;
//		}else {
//			CurNode= CurNode.nextNode;
//			return (T) CurNode.data;
//		}
		
		return (T) CurNode.data;
	}
	
	

	public void insertNode(T elem) {  //Insetion at end
		lengthOfLinkedList++;
		Node node = new Node(elem, null);
		if(head == null) {
			head = node;
			node.nextNode=head;
		}else {
			Node currNode = head;
		
			while(!currNode.nextNode.equals(head)) {
				currNode = currNode.nextNode;
				
			}
		
			node.nextNode=head;
			currNode.nextNode = node;
	
		}
	}


	public void insertionAtBeginning(T elem){
		lengthOfLinkedList++;
		Node node = new Node(elem, null);
		if(head == null) {
			head = node;
			node.nextNode=head;
		}else {

		Node temp = new Node(head.data, head.nextNode);

		Node currNode = head;
		while(!currNode.nextNode.equals(head)) {
			currNode = currNode.nextNode;
			
		}
		head = node;
		head.nextNode=temp;
		currNode.nextNode=head;
			
	
		}

	}


	public int Searching(T element){
Node currNode=head;
		int index=-1;
for(int i=0;i<lengthOfLinkedList;i++){

if(String.valueOf(element).equals(currNode.toString())){
index=i;
break;
}
currNode = currNode.nextNode;

}
		
return index;

	}

	
	
	public T deleteNode(int index) throws Exception{
		Node currNode = head;
		Node prevNode = null;
		

if(index==0){

	
	T ans =  (T) head.data;
	while(!(currNode.nextNode.equals(head))){
currNode=currNode.nextNode;
	}
currNode.nextNode= currNode.nextNode.nextNode;
head = currNode.nextNode;

return ans;


}else if(index<0){
	throw new Exception("Linked List is smaller than you expected. ");
}

else{
	for(int i=0; i< index; i++) {
		if(currNode != null && currNode.nextNode != head) {
			prevNode = currNode;
			
			currNode = currNode.nextNode;
		}else {
			throw new Exception("Linked List is smaller than you expected. ");
		}
	}
	Node nodeToConnect = currNode.nextNode;
	prevNode.nextNode = nodeToConnect;
	currNode.nextNode = null;
	lengthOfLinkedList--;
return (T) currNode.data;


}
		
	}
	
	public String toString() {
      if(head == null){
          return "";
      }
		StringBuffer elements = new StringBuffer();
		Node currNode = head;
		while(!currNode.nextNode.equals(head)) {
			elements = elements.append(currNode.data).append(", ");
			currNode = currNode.nextNode;
		}
		elements = elements.append(currNode.data);
		return elements.toString();
	}


	public T deleteElement(T element) throws Exception {
		
		return deleteNode(Searching(element));


	}
}
class Node<T>{
	T data;
	Node nextNode;
	
	Node(T data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public String toString(){

		return String.valueOf(data);

	}
}
