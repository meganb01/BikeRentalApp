/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.adt;

import bikerentalsystem.bike.Bike;

/**
 * BikeLinkedList manages all Bike objects in the system using a Singly Linked List structure.
 * @author megan
 */
public class BikeLinkedList {
    private BikeNode head;
    private int size;
    
    public BikeLinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    //add bike at the end
    public void add(Bike bike){
        BikeNode newNode = new BikeNode(bike, null);
        if(head == null){
            head = newNode;
        }else{
            BikeNode current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    
    //add bike at a specific position 
    public void add(int position, Bike bike){
        if(position == 1){
            head = new BikeNode(bike, head);
        }else{
            BikeNode prev = head;
            for(int i = 1; i < position -1; i++){
                prev = prev.getNext();
            }
            prev.setNext(new BikeNode(bike, prev.getNext()));
        }
        size++;
    }
    
    public Bike get(int position){
        BikeNode current = head;
        for(int i=1; i < position; i++){
            current = current.getNext();
        }
        return current.getBike();
    }
    
    public void remove(int position){
        if(position == 1){
            head = head.getNext();
        }else{
            BikeNode prev = head;
            for(int i = 1; i < position - 1; i++){
                prev = prev.getNext();
            }
            prev.setNext(prev.getNext().getNext());
        }
        size--;
    }
    
    public void printList(){
        BikeNode current = head;
        while(current != null){
            System.out.println(current);
            current = current.getNext();
        }
    }
}
