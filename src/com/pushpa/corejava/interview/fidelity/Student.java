package com.pushpa.corejava.interview.fidelity;

public class Student {
    int sId;
    String sName;
    String collegeName;
    String courseName;
    int percentage;

    public Student(int sId, String sName, String collegeName, String courseName, int percentage) {
        this.sId = sId;
        this.sName = sName;
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.percentage = percentage;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
