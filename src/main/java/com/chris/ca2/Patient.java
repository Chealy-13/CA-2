/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chris.ca2;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author chris
 */
public class Patient {

    String fName;
    String sName;
    LocalDate dob;
    LocalDate joinDate;
    private LinkedList<Appointments> appointments;
    //• The appointments associated with the Patient (an Appointment LinkedList). 

    public Patient() {
    }

    public Patient(String fName, String sName, LocalDate dob, LocalDate joinDate, LinkedList<Appointments> appointments) {
        this.fName = fName;
        this.sName = sName;
        this.dob = dob;
        this.joinDate = joinDate;
        this.appointments = appointments;
    } 

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public LinkedList<Appointments> getAppointments() {
        return appointments;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public void setAppointments(LinkedList<Appointments> appointments) {
        this.appointments = appointments;
    }

//Two Patients are considered equal where they have the same first name, second name and date of birth (irrespective of the rest
//of their fields).
    
}
