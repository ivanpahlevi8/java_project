package com.coba;

import javax.swing.text.html.parser.TagElement;

public class Human {
    public static final int LIFESPAN = 100;

    private String first_name;
    private String second_name;
    private int age;
    private float height;
    private Gender gender;


    public Human(String first_name, String second_name, int age, float height, Gender gender) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public Human(String first_name, int age, float height) {
        this.first_name = first_name;
        this.age = age;
        this.height = height;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return this.second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int get_time_to_live()
    {
        int i = LIFESPAN - age;
        return i;
    }
}
