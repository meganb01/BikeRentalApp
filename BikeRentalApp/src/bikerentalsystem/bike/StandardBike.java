/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.bike;

/**
 *
 * @author megan
 */
public class StandardBike extends Bike {

    public StandardBike(int bikeID, String model, boolean available) {
        super(bikeID, model, available);
    }
    
    @Override
    public String toString(){
        return "Standard Bike -> " +super.toString();
    }
    
}
