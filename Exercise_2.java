 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null ;
          
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        StackNode temp; 
        if(isEmpty()) 
          root = node;
        
       
        temp=root;
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
       if (isEmpty()) 
         System.out.println("Stack Underflow");
       
  //Write code to pop the topmost element of stack.
        StackNode temp,poppedNode;
        poppedNode = root;
        temp=root.next;
        root=temp;
        

	//Also return the popped element 
         return poppedNode.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;

    } 
 }
	//Driver code
   
   class Main{
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
   }
