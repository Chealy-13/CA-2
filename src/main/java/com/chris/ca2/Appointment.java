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

    String pFirstName;
    String pLastName;
    LocalDate pDOB;
    String issue;
    int triageLvl;
    String docName;

//Two Appointment are considered equal where they have the same patient data, issue and date, (irrespective of the rest of their
//fields). The natural order for Appointment is by triage level, where 1 has a higher priority than 5.
    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public Appointment() {
    }

    /**
     * Get the value of string
     *
     * @return the value of string
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
     * Get the value of string
     *
     * @return the value of string
     */
    public String getpFirstName() {
        return pFirstName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getpLastName() {
        return pLastName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public LocalDate getpDOB() {
        return pDOB;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public int getTriageLvl() {
        return triageLvl;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setpFirstName(String pFirstName) {
        this.pFirstName = pFirstName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setpLastName(String pLastName) {
        this.pLastName = pLastName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setpDOB(LocalDate pDOB) {
        this.pDOB = pDOB;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setTriageLvl(int triageLvl) {
        this.triageLvl = triageLvl;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    @Override
    public String toString() {
        return "Appointment{" + "pFirstName=" + pFirstName + ", pLastName=" + pLastName + ", pDOB=" + pDOB + ", issue=" + issue + ", triageLvl=" + triageLvl + ", docName=" + docName + '}';
    }

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
