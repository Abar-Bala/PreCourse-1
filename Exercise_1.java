class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
      if (top == 0) 
        return true; 
        else 
        return false;
    } 

    Stack() 
    { 
      this.top =0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX) {
          throw new StackOverflowError();
        }
        
           a[top++] = x;
           return true;
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) 
        throw new IllegalStateException();
           
        //Write your code here
       
          return(a[--top]);
        
    } 
  
    int peek() 
    { 
      return (a[top]);
   } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
