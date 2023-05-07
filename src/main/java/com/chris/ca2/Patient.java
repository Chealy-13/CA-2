/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chris.ca2;

import java.time.LocalDate;


/**
 *
 * @author chris
 */
public class Patient {

    String fName;
    String sName;
    LocalDate dob;
    LocalDate joinDate;
    private LinkedList appointments;
    //• The appointments associated with the Patient (an Appointment LinkedList). 

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public Patient() {
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public Patient(String fName, String sName, LocalDate dob, LocalDate joinDate, LinkedList appointments) {
        this.fName = fName;
        this.sName = sName;
        this.dob = dob;
        this.joinDate = joinDate;
        this.appointments = appointments;
    } 

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getfName() {
        return fName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getsName() {
        return sName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public LocalDate getJoinDate() {
        return joinDate;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public LinkedList getAppointments() {
        return appointments;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setAppointments(LinkedList appointments) {
        this.appointments = appointments;
    }

//Two Patients are considered equal where they have the same first name, second name and date of birth (irrespective of the rest
//of their fields).
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Patient)) {
            return false;
        }
        Patient patient = (Patient) o;
        return patient.fName.equals(fName)
                && patient.sName.equals(sName)
                && patient.dob.equals(dob);
    }
}
