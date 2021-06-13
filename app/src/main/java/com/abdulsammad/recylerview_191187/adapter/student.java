package com.abdulsammad.recylerview_191187.adapter;

public class student {
    String Name,RollNo,City;
    public student()
    {
    }

    public student(String name, String rollNo, String city) {
        Name = name;
        RollNo = rollNo;
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
