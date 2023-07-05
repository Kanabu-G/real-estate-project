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

class Tenant {
    private String name;
    private int tenantId;
    private String contactNumber;
    private String email;
    private String propertyRequirements;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getTenantId() {
        return tenantId;
    }
    
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPropertyRequirements() {
        return propertyRequirements;
    }
    
    public void setPropertyRequirements(String propertyRequirements) {
        this.propertyRequirements = propertyRequirements;
    }
    
    public void getTenantDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Tenant ID: " + getTenantId());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Property Requirements: " + getPropertyRequirements());
    }
}

public class CreateTenant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Tenant tenant = new Tenant();
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        tenant.setName(name);
        
        System.out.print("Enter Tenant ID: ");
        int tenantId = scanner.nextInt();
        tenant.setTenantId(tenantId);
        
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        tenant.setContactNumber(contactNumber);
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        tenant.setEmail(email);
        
        System.out.print("Enter property requirements: ");
        String propertyRequirements = scanner.nextLine();
        tenant.setPropertyRequirements(propertyRequirements);
        
        scanner.close();
        
        tenant.getTenantDetails();
    }
}

