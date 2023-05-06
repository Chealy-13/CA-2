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
public class Appointments {

    String pFirstName;
    String pLastName;
    LocalDate pDOB;
    String issue;
    int triageLvl;
    String docName;

//Two Appointments are considered equal where they have the same patient data, issue and date, (irrespective of the rest of their
//fields). The natural order for Appointments is by triage level, where 1 has a higher priority than 5.
    public Appointments() {
    }

    public Appointments(String pFirstName, String pLastName, LocalDate pDOB, String issue, int triageLvl, String docName) {
        this.pFirstName = pFirstName;
        this.pLastName = pLastName;
        this.pDOB = pDOB;
        this.issue = issue;
        this.triageLvl = triageLvl;
        this.docName = docName;
    }

    public String getpFirstName() {
        return pFirstName;
    }

    public String getpLastName() {
        return pLastName;
    }

    public LocalDate getpDOB() {
        return pDOB;
    }

    public String getIssue() {
        return issue;
    }

    public int getTriageLvl() {
        return triageLvl;
    }

    public String getDocName() {
        return docName;
    }

    public void setpFirstName(String pFirstName) {
        this.pFirstName = pFirstName;
    }

    public void setpLastName(String pLastName) {
        this.pLastName = pLastName;
    }

    public void setpDOB(LocalDate pDOB) {
        this.pDOB = pDOB;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setTriageLvl(int triageLvl) {
        this.triageLvl = triageLvl;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public String toString() {
        return "Appointments{" + "pFirstName=" + pFirstName + ", pLastName=" + pLastName + ", pDOB=" + pDOB + ", issue=" + issue + ", triageLvl=" + triageLvl + ", docName=" + docName + '}';
    }

}
