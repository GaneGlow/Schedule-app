package com.example.schedule_app.schedule_elements;

public class Lector {
    public String name; //указывается полное имя: Фамилия Имя Отчество - Иванов Иван Иванович, либо Фамилия И.О.,
    // либо другая конфигурация имени, просто не будет разделения на имя фамилия отчество
    public Discipline discipline;

    public Lector(String name, Discipline discipline) {
        this.name = name;
        this.discipline = discipline;
    }
}
