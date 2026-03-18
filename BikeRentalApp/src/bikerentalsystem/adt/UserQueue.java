/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.adt;

import bikerentalsystem.interfaces.QueueInterface;
import bikerentalsystem.user.User;
import java.util.ArrayList;

/**
 *
 * @author megan
 */
public class UserQueue implements QueueInterface {
    
    private ArrayList<User> queue;
    
    public UserQueue(){
        queue = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    @Override
    public int size(){
        return queue.size();
    }
    
    @Override
    public Object frontElement(){
        if(queue.size() > 0){
            return queue.get(0);
        }else{
            return null;
        }
    }
    
    @Override
    public void enqueue(Object element){
        queue.add((User) element);
    }
    
    @Override
    public Object dequeue(){
        if(queue.size() > 0){
            return queue.remove(0);
        }else{
            return null;
        }
    }
}
