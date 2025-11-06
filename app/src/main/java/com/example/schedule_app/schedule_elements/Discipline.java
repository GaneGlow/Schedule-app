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

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDenominator(boolean denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(boolean numerator) {
        this.numerator = numerator;
    }

    public Discipline(String name, String day, String time) {
        this(name, day, time, false, false);
    }
}
