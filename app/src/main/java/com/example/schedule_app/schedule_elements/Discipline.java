package com.example.schedule_app.schedule_elements;

public class Discipline {

    public String name;
    public  String day;
    public  String time;
    public boolean denominator;
    public boolean numerator;

    public Discipline(String name, String day, String time, boolean denominator, boolean numerator) {
        this.name = name;
        this.day = day;
        this.time = time;
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Discipline(String name, String day, String time) {
        this(name, day, time, false, false);
    }
}
