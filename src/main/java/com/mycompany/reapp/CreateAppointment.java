/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reapp;

/**
 *
 * @author Luther
 */

import java.util.Date;

class Appointment {
    private int appointmentId;
    private int propertyId;
    private int tenantId;
    private Date date;
    
    public int getAppointmentId() {
        return appointmentId;
    }
    
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }
    
    public int getPropertyId() {
        return propertyId;
    }
    
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
    
    public int getTenantId() {
        return tenantId;
    }
    
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void getAppointmentDetails() {
        System.out.println("Appointment ID: " + getAppointmentId());
        System.out.println("Property ID: " + getPropertyId());
        System.out.println("Tenant ID: " + getTenantId());
        System.out.println("Date: " + getDate());
    }
}

public class CreateAppointment {
    public static void main(String[] args) {
        Appointment appointment = new Appointment();
        
        appointment.setAppointmentId(5);
        appointment.setPropertyId(234);
        appointment.setTenantId(456);
        appointment.setDate(new Date());
        
        appointment.getAppointmentDetails();
    }
}

