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

class Agent {
    private String name;
    private int agentId;
    private String contactNumber;
    private String email;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAgentId() {
        return agentId;
    }
    
    public void setAgentId(int agentId) {
        this.agentId = agentId;
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
    
    public void getAgentDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Agent ID: " + getAgentId());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Email: " + getEmail());
    }
}

public class CreateAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Agent agentJohn = new Agent();
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        agentJohn.setName(name);
        
        System.out.print("Enter agent ID: ");
        int agentId = scanner.nextInt();
        agentJohn.setAgentId(agentId);
        
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        agentJohn.setContactNumber(contactNumber);
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        agentJohn.setEmail(email);
        
        scanner.close();
        
        agentJohn.getAgentDetails();
    }
}



