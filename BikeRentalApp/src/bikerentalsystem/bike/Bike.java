/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.bike;

/**
 *
 * @author megan
 */
public class Bike {
    private int bikeID;
    private String model;
    private boolean available;
    
    //constructor
    public Bike(int bikeID, String model, boolean available){
        this.bikeID = bikeID;
        this.model = model;
        this.available = available;
    }
    
    //getters and setters

    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public String toString(){
        return "Bike ID: " +bikeID + " Model: " +model+ " Available: "+available;
    }
}
