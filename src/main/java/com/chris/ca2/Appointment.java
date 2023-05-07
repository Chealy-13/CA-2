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
public class Appointment implements Comparable<Appointment> {

    private String pFirstName;
    private String pLastName;
    private LocalDate pDOB;
    private String issue;
    private int triageLvl;
    private String docName;

//Two Appointment are considered equal where they have the same patient data, issue and date, (irrespective of the rest of their
//fields). The natural order for Appointment is by triage level, where 1 has a higher priority than 5.
    /**
     * Constructs a new Appointment object with default values for all fields
     *
     * All strings will be empty, date will be set to current date, int will be 0
     */
    public Appointment() {
    }

    /**
     * Constructs a new Appointment object with specific fields
     *
     * All strings will be empty, date will be set to current date, int will be 0
     */
    public Appointment(String pFirstName, String pLastName, LocalDate pDOB, String issue, int triageLvl, String docName) {
        this.pFirstName = pFirstName;
        this.pLastName = pLastName;
        this.pDOB = pDOB;
        this.issue = issue;
        this.triageLvl = triageLvl;
        this.docName = docName;
    }

    /**
     * Get first name of patient
     *
     * @return String pFirstname, the first name of the patient
     */
    public String getpFirstName() {
        return pFirstName;
    }

    /**
     * Get last name of patient
     *
     * @return String pLastname, the last name of the patient
     */
    public String getpLastName() {
        return pLastName;
    }

    /**
     * Get Date of birth of patient
     *
     * @return localDate pDOB, the date of birth of patient
     */
    public LocalDate getpDOB() {
        return pDOB;
    }

    /**
     * Get issue of patient
     *
     * @return issue, String of the issue patient has
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Get Triage level
     *
     * @return triageLvl, int of triage level for patients issue
     */
    public int getTriageLvl() {
        return triageLvl;
    }

    /**
     * Get doctors name
     *
     * @return docName, string of doctors name
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the first name of patient to parameter
     *@param String pFirstName, the new name
     * @return pFirstName, the string updated first name
     */
    public void setpFirstName(String pFirstName) {
        this.pFirstName = pFirstName;
    }

    /**
     * Sets the last name of patient to parameter
     *@param String pLastName, the new name
     * @return pLastName, the string updated last name
     */
    public void setpLastName(String pLastName) {
        this.pLastName = pLastName;
    }

    /**
     * Set the value of patients DOB
     * @param LocalDate pDOB, the new date of birth
     * @return pDob, the updated date of birth for patient
     */
    public void setpDOB(LocalDate pDOB) {
        this.pDOB = pDOB;
    }

    /**
     * Set the value of issue of patient
     * @param String issue
     * @return issue, the updated string issue of patient
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * Set the triage Level of patient
     * @param int triageeLvl
     * @return triageLvl, updated int triage level of patient
     */
    public void setTriageLvl(int triageLvl) {
        this.triageLvl = triageLvl;
    }

    /**
     * Set the doctors name
     * @param String docName
     * @return docName, the updated string doctors name
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /**
     * Gets the Appointment object displayed as a string
     *
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return "Appointment{" + "pFirstName=" + pFirstName + ", pLastName=" + pLastName + ", pDOB=" + pDOB + ", issue=" + issue + ", triageLvl=" + triageLvl + ", docName=" + docName + '}';
    }

    /**
     * Compares this object to a particular object to see if equal
     * @param object o, object to compare with
     * @return boolean, true if object equals specified object, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Appointment)) {
            return false;
        }
        Appointment appointment = (Appointment) o;
        return appointment.pFirstName.equals(pFirstName)
                && appointment.pLastName.equals(pLastName)
                && appointment.pDOB.equals(pDOB)
                && appointment.issue.equals(issue);
    }

    /**
     * Compares an appointment object with another appointment object based on triage level
     * @param Appointment app, object to compare with
     * @return int, negative, positive or 0 if object is less than, greater than or equal to other object
     */
    @Override
    public int compareTo(Appointment app) {
        if (this.getTriageLvl() < app.getTriageLvl()) {
            return -1;
        } else if (this.getTriageLvl() > app.getTriageLvl()) {
            return 1;
        } else {
            return 0;
        }
    }

}
