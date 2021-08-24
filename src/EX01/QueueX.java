package EX01;

public class QueueX {
     private int QueueArr[];
     private int maxSize;
     private int rear;// store index of rear value
     private int front;//index of front
     private int noItems;//no of items in array
     
     public QueueX(int s)
     {
    	 maxSize = s;
    	 QueueArr = new int[maxSize];
    	 front = 0;
    	 noItems = 0;
    	 rear =-1;
    	  
     }
     public void insert(int j)
     {
    	 if(rear == maxSize -1) {
    		 System.out.println("Queue is full");
    		 
    	 }
    	 else {
    		 QueueArr[++rear] = j;
    		 noItems++;
    	 }
     }
     public int remove()
     {
    	 if(noItems ==0) {
    		 System.out.println("Queue is empty");
    		 return -99;
    		 
    	 }
    	 else {
    		 noItems--;
    		 return QueueArr[front++];
    		 
    	 }
     }
     public boolean isEmpty()
     {
    	 if(noItems ==0) {
    		 return true;
    		 
    	 }
    	 else {
    		 return false; 
    	 }

     }
     public boolean isFull()
     {
    	 if(noItems == maxSize) {
    		 return true;
    		 
    	 }
    	 else {
    		 return false; 
    	 }

     }
     
}
