package com.app.e_fir;

import android.widget.EditText;

public class Victim {
    private EditText Fname;
    private EditText Lname;
    private EditText Mname;
    private String inciDet;
    private String date;

    public Victim() {
    }

    public EditText getFname() {
        return Fname;
    }

    public void setFname(EditText fname) {
        Fname = fname;
    }

    public EditText getLname() {
        return Lname;
    }

    public void setLname(EditText lname) {
        Lname = lname;
    }

    public EditText getMname() {
        return Mname;
    }

    public void setMname(EditText mname) {
        Mname = mname;
    }

    public String getInciDet(EditText inciDetails) {
        return inciDet;
    }

    public void setInciDet(String inciDet) {
        this.inciDet = inciDet;
    }

    public String getDate(String dor) {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
