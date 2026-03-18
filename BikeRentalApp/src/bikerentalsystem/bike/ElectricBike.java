/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.bike;

/**
 *
 * @author megan
 */
public class ElectricBike extends Bike {
    
    private int batteryLevel;

    public ElectricBike(int batteryLevel, int bikeID, String model, boolean available) {
        super(bikeID, model, available);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    
    @Override
    public String toString(){
        return "Electric Bike: " +super.toString() + ", Battery: "+ batteryLevel;
    }
}
