package com.jasonbutwell.customlistviewadapter;

/**
 * Created by J on 05/12/2016.
 */

public class PersonRecord {

    private String firstName;
    private String secondName;
    private String jobTitle;
    private int age;
    private int imageID;

    public PersonRecord(String firstName, String secondName, String jobTitle, int age, int imageID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.jobTitle = jobTitle;
        this.age = age;
        this.imageID = imageID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

}
