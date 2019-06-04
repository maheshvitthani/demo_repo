package com.operations;

public class LinkedListOperation extends LinkedList{
	public static void main(String[] args) 
    { 
        
        LinkedList list = new LinkedList(); 
  
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        
        printList(list);
        deleteNode(getCount()-1);
        printList(list);
        deleteList();
        printList(list);
        
        
    } 

}
