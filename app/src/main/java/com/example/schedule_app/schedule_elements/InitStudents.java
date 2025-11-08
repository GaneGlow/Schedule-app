package com.example.schedule_app.schedule_elements;

public class InitStudents {

    public int group;
    public int subGroup;
    public int course;

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public InitStudents(int group, int course) {
        this.group = group;
        this.course = course;
    }

    public void setSubGroup(int subGroup) {
        this.subGroup = subGroup;
    }

    public InitStudents(int group, int subGroup, int course) {
        this.group = group;
        this.subGroup = subGroup;
        this.course = course;
    }
}
