package com.operations;

public class LinkedList {
	
	 static Node head; 
	  
	    static class Node { 
	  
	        int data; 
	        Node next; 
	        Node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	      
	    // append element in linked list 
	    public static LinkedList insert(LinkedList list, int data) 
	    { 
	      
	        Node new_node = new Node(data); 
	        new_node.next = null; 
	   
	        if (list.head == null) { 
	            list.head = new_node; 
	        } 
	        else { 
	            
	            Node last = list.head; 
	            while (last.next != null) { 
	                last = last.next; 
	            } 
	            last.next = new_node; 
	        } 
	   
	        return list; 
	    } 
	    
	    static void deleteList() 
	    { 
	        head = null; 
	    } 
	    
	    
	    
	    static void deleteNode(int position) 
	    { 
	      
	        if (head == null) 
	            return; 
	        Node temp = head; 
	  
	       
	        if (position == 0) 
	        { 
	            head = temp.next;   // Change head 
	            return; 
	        } 
	  
	        
	        for (int i=0; temp!=null && i<position-1; i++) 
	            temp = temp.next; 
	  
	         
	        if (temp == null || temp.next == null) 
	            return; 
	  
	        Node next = temp.next.next; 
	  
	        temp.next = next; 
	    } 
	    
	    /* Returns count of nodes in linked list */
	    public static int getCountRec(Node node) 
	    { 
	        if (node == null) 
	            return 0; 
	        return 1 + getCountRec(node.next); 
	    } 
	  
	    public static int getCount() 
	    { 
	        return getCountRec(head); 
	    }
	    
	    
	    
	  
	    // Method to print the LinkedList. 
	    public static void printList(LinkedList list) 
	    { 
	        Node currNode = list.head; 
	  
	        System.out.print("LinkedList: "); 
	  
	        while (currNode != null) { 
	             
	            System.out.print(currNode.data + " "); 
	  
	            currNode = currNode.next; 
	        } 
	    }
}
