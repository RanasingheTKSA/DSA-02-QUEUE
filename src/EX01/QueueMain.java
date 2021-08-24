package EX01;
import java.util.*;

public class QueueMain {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        QueueX mainqueue = new QueueX(5);
        int transID;
        for(int i=1; i<=5; i++)
        {
        	System.out.println("Enter transaction ID" +i+ ":");
        	transID=sc.nextInt();
        	mainqueue.insert(transID);
        }
        QueueX evenqueue = new QueueX(5);
        QueueX oddqueue = new QueueX(5);
        
        int value;
        while(!mainqueue.isEmpty()) {
        	value=mainqueue.remove();
        	if(value % 2==0) {
        		evenqueue.insert(value);
        	}
        	else {
        		oddqueue.insert(value);
        	}}
        	System.out.println("PC 1");
        	while(!evenqueue.isEmpty()) {
        		System.out.println("Transaction"+ evenqueue.remove());
        	}
        	System.out.println("PC 2");
        	while(!evenqueue.isEmpty()) {
        		System.out.println("Transaction"+ oddqueue.remove());
        	}
        }
	}


