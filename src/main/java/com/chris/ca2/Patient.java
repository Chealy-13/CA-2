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

    private String fName;
    private String sName;
    private LocalDate dob;
    private LocalDate joinDate;
    private LinkedList appointments;
    //• The appointments associated with the Patient (an Appointment LinkedList). 

    /**
     * Constructs a new Patient object with default values for all fields
     *
     * All strings will be empty, date will be set to current date, Linkedlist
     * will be empty
     */
    public Patient() {
    }

    /**
     * Constructs a new Patient object with specific fields
     *
     * All strings will be empty, date will be set to current date, Linkedlist
     * will be empty
     */
    public Patient(String fName, String sName, LocalDate dob, LocalDate joinDate, LinkedList appointments) {
        this.fName = fName;
        this.sName = sName;
        this.dob = dob;
        this.joinDate = joinDate;
        this.appointments = appointments;
    }

    /**
     * Get the value of first name of patient
     *
     * @return the value of the string
     */
    public String getfName() {
        return fName;
    }

    /**
     * Get the value of second name of Patient
     *
     * @return the value of string
     */
    public String getsName() {
        return sName;
    }

    /**
     * Get the value of the patients date of birth
     *
     * @return the value of DOB
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * Get the LocalDate value of the customers join date
     *
     * @return the value of the join Date
     */
    public LocalDate getJoinDate() {
        return joinDate;
    }

    /**
     * Get the linkedList of appointments
     *
     * @return the value inside the linkedList
     */
    public LinkedList getAppointments() {
        return appointments;
    }

    /**
     * Set the first name of the patient
     *
     * @param the String name to be updated
     * @return the value of updated first name
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Set the last name of the patient
     *
     * @param the String name to be updated
     * @return the value of updated last name
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * Set the value of patients DOB
     *
     * @param the date to update
     * @return the value of localDate of patients dob
     */
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /**
     * Set the join date of a customer
     *
     * @param the joindate to update
     * @return the value of the updated join date
     */
    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * Set appointments in the linked List
     *
     * @param the linkedlist of appointments to update
     * @return the updated linkedList
     */
    public void setAppointments(LinkedList appointments) {
        this.appointments = appointments;
    }

//Two Patients are considered equal where they have the same first name, second name and date of birth (irrespective of the rest
//of their fields).
    /**
     * compares the patient object to the specified object to see if equal
     *
     * @param the object to compare the patient against
     * @return boolean, true if both objects match, false otherwise
     */
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
