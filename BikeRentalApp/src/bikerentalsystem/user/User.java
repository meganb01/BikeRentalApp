/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikerentalsystem.user;

/**
 *
 * @author megan
 */
public class User {
    private int userID;
    private String name;
    
    //constructor

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
    }
    
    //getters and setters

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "User ID: " + userID + ", Name: " +name;
    }
}
