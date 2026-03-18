/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.adt;

import bikerentalsystem.bike.Bike;
import bikerentalsystem.interfaces.StackInterface;
import java.util.ArrayList;

/**
 *
 * @author megan
 */
public class BikeStack implements StackInterface{
    
    private ArrayList<Bike> stack;
    
    public BikeStack(){
        stack = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    @Override
    public boolean isFull(){
        return false; 
    }
    
    @Override
    public void push(Object newItem){
        stack.add(0, (Bike) newItem);
    }
    
    @Override
    public Object pop(){
        if(!stack.isEmpty()){
            return stack.remove(0);
        }else{
            return null;
        }
    }
    
    @Override
    public int size(){
        return stack.size();
    }
}
