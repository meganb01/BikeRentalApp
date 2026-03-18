/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.adt;

import bikerentalsystem.bike.Bike;

/**
 *
 * @author megan
 */
public class BikeNode {
    private Bike bike;
    private BikeNode next;

    public BikeNode(Bike bike, BikeNode next) {
        this.bike = bike;
        this.next = next;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public BikeNode getNext() {
        return next;
    }

    public void setNext(BikeNode next) {
        this.next = next;
    }
    
    @Override
    public String toString(){
        return bike.toString();
    }
}
