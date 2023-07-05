/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reapp;

/**
 *
 * @author Luther
 */
import java.util.Scanner;

class Property {
    private int propertyId;
    private String address;
    private String propertyType;
    private double price;
    private String description;
    private String appointment;
    private boolean availability;
    
    public int getPropertyId() {
        return propertyId;
    }
    
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPropertyType() {
        return propertyType;
    }
    
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAppointment() {
        return appointment;
    }
    
    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
    
    public boolean isAvailability() {
        return availability;
    }
    
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public void getPropertyDetails() {
        System.out.println("Property ID: " + getPropertyId());
        System.out.println("Address: " + getAddress());
        System.out.println("Property Type: " + getPropertyType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Appointment: " + getAppointment());
        System.out.println("Availability: " + isAvailability());
    }
}

public class CreateProperty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Property property = new Property();
        
        System.out.print("Enter Property ID: ");
        int propertyId = scanner.nextInt();
        property.setPropertyId(propertyId);
        
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        property.setAddress(address);
        
        System.out.print("Enter Property Type: ");
        String propertyType = scanner.nextLine();
        property.setPropertyType(propertyType);
        
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        property.setPrice(price);
        
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        property.setDescription(description);
        
        System.out.print("Enter Appointment: ");
        String appointment = scanner.nextLine();
        property.setAppointment(appointment);
        
        System.out.print("Enter Availability (true/false): ");
        boolean availability = scanner.nextBoolean();
        property.setAvailability(availability);
        
        scanner.close();
        
        property.getPropertyDetails();
    }
}

